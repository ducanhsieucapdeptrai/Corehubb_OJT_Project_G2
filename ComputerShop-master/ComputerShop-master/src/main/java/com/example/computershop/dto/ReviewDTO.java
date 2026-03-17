package com.example.computershop.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReviewDTO {
    String reviewId;
    String userId;
    String productId;
    Integer rating;
    String comment;
    LocalDateTime createdAt;
    
    // User info (without circular reference)
    UserInfo user;
    
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class UserInfo {
        String userId;
        String fullName;
        String image;
    }
} 