package com.sparta.springresttemplateserver.entity;

import lombok.Getter;

/**
 * ✅ Item 클래스는 애플리케이션 내에서 아이템 정보를 저장하기 위한 엔티티 클래스입니다.
 *
 *    ➡️ 주로 아이템의 제목과 가격 정보를 관리합니다.
 */
@Getter
public class Item {
    private String title; // 아이템의 제목을 나타내는 필드입니다.
    private int price; // 아이템의 가격을 나타내는 필드입니다.

    /**
     * ✅ Item 클래스의 생성자입니다.
     *
     *    ➡️ 아이템의 제목과 가격을 인자로 받아 해당 필드들을 초기화합니다.
     *
     * @param title 아이템의 제목입니다.
     * @param price 아이템의 가격입니다.
     */
    public Item(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
