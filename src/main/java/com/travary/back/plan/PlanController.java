package com.travary.back.plan;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/plan")
@AllArgsConstructor
public class PlanController {
    private PlanService planService;

    // plan 생성
    @PostMapping(value="/create", consumes="application/json;")
    public String postPlan(@RequestBody Plan plan) {
        System.out.println(plan);
        this.planService.postPlan(plan);
        return "createPlan success";
    }
}
