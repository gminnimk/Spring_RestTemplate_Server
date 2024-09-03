package com.sparta.springresttemplateserver.dto;

import com.sparta.springresttemplateserver.entity.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * ✅ ItemResponseDto 클래스는 여러 개의 Item 객체를 담아 클라이언트에게 반환하기 위한 DTO 입니다.
 *
 *    ➡️ 주로 리스트 형식의 아이템 데이터를 포함하여 클라이언트에게 전송합니다.
 */
@Getter
public class ItemResponseDto {
    // 여러 Item 객체를 담을 수 있는 리스트로, 이 리스트는 변경되지 않도록 final로 선언되었습니다.
    private final List<Item> items = new ArrayList<>();

    /**
     * ✅ 단일 Item 객체를 items 리스트에 추가하는 메서드입니다.
     *
     *    ➡️ 외부에서 호출하여 Item 객체를 리스트에 추가할 수 있습니다.
     *
     * @param item 추가할 Item 객체입니다.
     */
    public void setItems(Item item) {
        items.add(item); // 전달된 Item 객체를 리스트에 추가합니다.
    }
}