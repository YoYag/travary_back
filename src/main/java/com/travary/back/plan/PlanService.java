package com.travary.back.plan;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PlanService {
    private final PlanRepository planRepository;

    @Transactional
    public void postPlan(Plan plan) {
        Plan postPlan = plan.createPlan(plan);
        this.planRepository.save(postPlan);
    }
}
