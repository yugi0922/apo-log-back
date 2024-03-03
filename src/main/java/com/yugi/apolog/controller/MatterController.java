package com.yugi.apolog.controller;

import com.yugi.apolog.domain.ApoResult;
import com.yugi.apolog.service.MatterService;
import model.TMatter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matter")
public class MatterController {

    private final MatterService matterService;

    public MatterController(MatterService matterService) {
        this.matterService = matterService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<TMatter>> getAllMatters() {
        return ResponseEntity.ok(matterService.findAll());
    }

    @PostMapping("/new")
    public ResponseEntity<?> createMatter(@RequestBody TMatter tMatter) {
        try {
            TMatter created = matterService.createTMatter(tMatter);
            return ResponseEntity.ok(created);
        } catch (Exception e) {
            // エラーハンドリング
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    // /resultエンドポイントを追加
    @GetMapping("/result")
    public ResponseEntity<?> getApoResult() {
        try {
            ApoResult result = matterService.generateApoResult();
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            // エラーハンドリング
            return ResponseEntity.internalServerError().body("Error fetching apo result: " + e.getMessage());
        }
    }
}

