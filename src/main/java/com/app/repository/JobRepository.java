package com.app.repository;

import com.app.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//RestResource(collectionResourceRel = "jobPosts", path = "jobPosts")
public interface JobRepository extends JpaRepository<JobPost, Integer> {
}
