package com.example.computershop.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PasswordChangeRequest {
    
    @NotBlank(message = "Current Password can not be blank")
    private String currentPassword;
    
    @NotBlank(message = "New Password can not be blank")
    @Size(min = 6, max = 100, message = "Mật khẩu mới phải từ 6-100 ký tự")
    private String newPassword;
    
    @NotBlank(message = "Confirmed Password can not be blank")
    private String confirmPassword;
    
    // Helper method to validate password confirmation
    public boolean isPasswordConfirmed() {
        return newPassword != null && newPassword.equals(confirmPassword);
    }
} 