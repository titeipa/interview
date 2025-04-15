package com.interview.controller;


import com.interview.model.JobStatus;
import com.interview.model.dto.JobCreateRequest;
import com.interview.model.dto.JobResponse;
import com.interview.model.dto.JobUpdateRequest;
import com.interview.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobs")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping("/car/{vin}")
    public List<JobResponse> findAllJobsByCar(@PathVariable String vin) {
        return jobService.findAllJobsByCar(vin);
    }

    @GetMapping()
    public List<JobResponse> findAllJobsPaginated(String vin) {
        return jobService.findJobsByStatusPaginated(JobStatus.SCHEDULED, PageRequest.of(
                0,
                2,
                Sort.by("scheduledAt").descending()
        ));
    }

    @GetMapping("/{id}")
    public JobResponse jobs(@PathVariable Integer id) {
        return jobService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public JobResponse createJob(@RequestBody JobCreateRequest jobCreateRequest) {
        return jobService.createJob(jobCreateRequest);
    }

    @PutMapping("/{id}")
    public void updateJob(@PathVariable Integer id, @RequestBody JobUpdateRequest jobUpdateRequest) {
        jobService.updateJob(id, jobUpdateRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJob(@PathVariable Integer id) {
        jobService.deleteJob(id);
    }
}
