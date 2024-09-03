package com.sparta.springresttemplateserver.dto;

import lombok.Getter;

/**
 * ✅ UserRequestDto 클래스는 클라이언트로부터 사용자 정보를 입력받기 위한 DTO 입니다.
 *
 *    ➡️ 주로 사용자 인증, 로그인 또는 회원가입 요청 시 사용됩니다.
 */
@Getter
public class UserRequestDto {
    private String username; // 사용자의 이름 또는 아이디를 나타내는 필드입니다.
    private String password; // 사용자의 비밀번호를 나타내는 필드입니다.
}