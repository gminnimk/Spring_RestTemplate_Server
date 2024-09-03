package com.sparta.springresttemplateserver.controller;

import com.sparta.springresttemplateserver.dto.ItemResponseDto;
import com.sparta.springresttemplateserver.dto.UserRequestDto;
import com.sparta.springresttemplateserver.entity.Item;
import com.sparta.springresttemplateserver.service.ItemService;
import org.springframework.web.bind.annotation.*;

/**
 * ✅ ItemController 클래스는 클라이언트 요청을 처리하고, ItemService와 상호작용하여 아이템 관련 데이터를 반환하는 역할을 합니다.
 *
 *    ➡️ 주로 REST API 엔드포인트를 제공하여 클라이언트와 서버 간의 데이터 통신을 처리합니다.
 */
@RestController
@RequestMapping("/api/server") // 모든 요청이 "/api/server" 경로를 기반으로 매핑됩니다.
public class ItemController {

    private final ItemService itemService; // 아이템 관련 비즈니스 로직을 처리하는 서비스 클래스입니다.

    // ItemService를 주입받는 생성자입니다.
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * ✅ 클라이언트가 전달한 쿼리 파라미터를 기반으로, 특정 아이템 정보를 반환합니다.
     *
     *    ➡️ GET 요청으로 특정 아이템 데이터를 조회할 때 사용됩니다.
     *
     * @param query 검색 쿼리 파라미터로, 아이템을 조회할 때 사용됩니다.
     * @return Item 해당 쿼리와 일치하는 아이템 정보를 반환합니다.
     */
    @GetMapping("/get-call-obj")
    public Item getCallObject(@RequestParam String query) {
        return itemService.getCallObject(query);
    }

    /**
     * ✅ 모든 아이템의 리스트를 ItemResponseDto 형식으로 반환합니다.
     *
     *    ➡️ GET 요청으로 전체 아이템 목록을 조회할 때 사용됩니다.
     *
     * @return ItemResponseDto 모든 아이템 목록을 포함하는 DTO입니다.
     */
    @GetMapping("/get-call-list")
    public ItemResponseDto getCallList() {
        return itemService.getCallList();
    }

    /**
     * ✅ 클라이언트가 전달한 쿼리와 요청 본문 데이터를 기반으로 아이템을 생성합니다.
     *
     *    ➡️ POST 요청으로 새로운 아이템을 생성할 때 사용됩니다.
     *
     * @param query URL 경로에 포함된 쿼리 파라미터로, 아이템 생성 시 사용됩니다.
     * @param requestDto 요청 본문에 포함된 사용자 데이터를 나타내는 DTO입니다.
     * @return Item 생성된 아이템의 정보를 반환합니다.
     */
    @PostMapping("/post-call/{query}")
    public Item postCall(@PathVariable String query, @RequestBody UserRequestDto requestDto) {
        return itemService.postCall(query, requestDto);
    }

    /**
     * ✅ 클라이언트가 전달한 인증 토큰과 요청 본문 데이터를 기반으로, 아이템 관련 데이터를 처리합니다.
     *
     *    ➡️ POST 요청으로 인증이 필요한 아이템 관련 작업을 수행할 때 사용됩니다.
     *
     * @param token 요청 헤더에 포함된 인증 토큰입니다.
     * @param requestDto 요청 본문에 포함된 사용자 데이터를 나타내는 DTO입니다.
     * @return ItemResponseDto 아이템 처리 결과를 포함하는 DTO입니다.
     */
    @PostMapping("/exchange-call")
    public ItemResponseDto exchangeCall(@RequestHeader("X-Authorization") String token, @RequestBody UserRequestDto requestDto) {
        return itemService.exchangeCall(token, requestDto);
    }
}
