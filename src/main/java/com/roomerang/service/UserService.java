package com.roomerang.service;

import com.roomerang.dto.request.UserCreateRequest;
import com.roomerang.dto.request.UserFindRequest;
import com.roomerang.dto.request.UserVerifyRequest;
import com.roomerang.dto.response.UserFindResponse;
import com.roomerang.entity.User;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface UserService {
    void validatePassword(String password, String confirmPassword, BindingResult bindingResult);
    boolean createUser(UserCreateRequest userCreateRequest, BindingResult bindingResult);
    User login(String username, String rawPassword);
    List<UserFindResponse> getMaskedUsers(UserFindRequest userFindRequest);
    boolean verifySequrityAnswer(UserVerifyRequest userVerifyRequest);
    String revealUsername(Long userId);
    void resetPassword(Long userId, String newPassword);
}