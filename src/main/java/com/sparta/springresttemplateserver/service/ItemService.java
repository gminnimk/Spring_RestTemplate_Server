package com.sparta.springresttemplateserver.service;

import com.sparta.springresttemplateserver.dto.ItemResponseDto;
import com.sparta.springresttemplateserver.dto.UserRequestDto;
import com.sparta.springresttemplateserver.entity.Item;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * ✅ ItemService 클래스는 아이템 관련 비즈니스 로직을 처리하는 서비스 클래스입니다.
 *
 *    ➡️ 아이템 데이터를 관리하고, 클라이언트의 요청에 따라 아이템 정보를 제공하는 역할을 합니다.
 */
@Service // Spring의 서비스 컴포넌트로 등록됩니다.
public class ItemService {

    // 아이템 목록을 하드코딩한 예제 데이터입니다. 실제 애플리케이션에서는 데이터베이스에서 조회됩니다.
    private final List<Item> itemList = Arrays.asList(
        new Item("Mac", 3_888_000),
        new Item("iPad", 1_230_000),
        new Item("iPhone", 1_550_000),
        new Item("Watch", 450_000),
        new Item("AirPods", 350_000)
    );

    /**
     * ✅ 클라이언트가 전달한 쿼리 파라미터를 기반으로 특정 아이템을 반환합니다.
     *
     *    ➡️ 아이템 목록에서 제목이 쿼리와 일치하는 아이템을 검색하여 반환합니다.
     *
     * @param query 아이템을 검색하는 쿼리 파라미터입니다.
     * @return Item 쿼리와 일치하는 아이템 정보를 반환합니다. 일치하는 아이템이 없으면 null을 반환합니다.
     */
    public Item getCallObject(String query) {
        // 아이템 목록을 순회하여 제목이 쿼리와 일치하는 아이템을 반환합니다.
        for (Item item : itemList) {
            if (item.getTitle().equals(query)) {
                return item;
            }
        }
        // 일치하는 아이템이 없는 경우 null을 반환합니다.
        return null;
    }

    /**
     * ✅ 모든 아이템의 리스트를 ItemResponseDto 형식으로 반환합니다.
     *
     *    ➡️ 모든 아이템을 포함하는 DTO를 생성하여 반환합니다.
     *
     * @return ItemResponseDto 모든 아이템 목록을 포함하는 DTO를 반환합니다.
     */
    public ItemResponseDto getCallList() {
        // ItemResponseDto 객체를 생성합니다.
        ItemResponseDto responseDto = new ItemResponseDto();
        // 아이템 목록을 순회하며 DTO에 아이템을 추가합니다.
        for (Item item : itemList) {
            responseDto.setItems(item);
        }
        // 생성된 DTO를 반환합니다.
        return responseDto;
    }

    /**
     * ✅ 클라이언트가 전달한 쿼리와 요청 본문 데이터를 기반으로 아이템을 생성합니다.
     *
     *    ➡️ 쿼리와 요청 본문 데이터를 바탕으로 새로운 아이템을 생성하고 반환합니다.
     *
     * @param query 아이템 생성 시 사용되는 쿼리 파라미터입니다.
     * @param requestDto 아이템 생성에 필요한 사용자 요청 데이터를 포함한 DTO입니다.
     * @return Item 생성된 아이템의 정보를 반환합니다.
     */
    public Item postCall(String query, UserRequestDto requestDto) {
        // 실제 구현에서는 요청 데이터를 바탕으로 새로운 아이템을 생성하고 저장하는 로직이 들어갑니다.
        return null; // 현재는 구현되지 않았습니다.
    }

    /**
     * ✅ 클라이언트가 전달한 인증 토큰과 요청 본문 데이터를 기반으로 아이템 관련 작업을 수행합니다.
     *
     *    ➡️ 인증 토큰과 요청 본문을 바탕으로 아이템을 처리하고, 결과를 반환합니다.
     *
     * @param token 요청 헤더에 포함된 인증 토큰입니다.
     * @param requestDto 요청 본문에 포함된 사용자 데이터를 나타내는 DTO입니다.
     * @return ItemResponseDto 아이템 처리 결과를 포함하는 DTO를 반환합니다.
     */
    public ItemResponseDto exchangeCall(String token, UserRequestDto requestDto) {
        // 실제 구현에서는 인증 토큰과 요청 데이터를 바탕으로 아이템을 처리하고 결과를 반환하는 로직이 들어갑니다.
        return null; // 현재는 구현되지 않았습니다.
    }
}