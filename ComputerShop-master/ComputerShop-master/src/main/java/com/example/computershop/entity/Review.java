package com.example.computershop.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ReviewID", columnDefinition = "UNIQUEIDENTIFIER")
    String reviewId;
    
    @Column(name = "UserID", columnDefinition = "UNIQUEIDENTIFIER")
    String userId;
    
    @Column(name = "ProductID", columnDefinition = "UNIQUEIDENTIFIER") 
    String productId;
    
    @Column(name = "Rating", nullable = false)
    Integer rating; // 1-5
    
    @Column(name = "Comment", columnDefinition = "NVARCHAR(1000)")
    String comment;
    
    @Column(name = "CreatedAt", columnDefinition = "DATETIME2")
    LocalDateTime createdAt;
    
    // Relationships
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID", referencedColumnName = "user_id", insertable = false, updatable = false)
    User user;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductID", referencedColumnName = "productID", insertable = false, updatable = false)
    Products product;
    
    @PrePersist
    public void prePersist() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }
} 