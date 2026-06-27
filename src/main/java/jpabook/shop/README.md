<img width="1514" height="1988" alt="Image" src="https://github.com/user-attachments/assets/0c779719-40d4-4c3a-9000-10bf4f60d3a2" />

**테이블 수: 28개 / 핵심 JPA 연습 포인트**

| 난이도 | 주제 | 관련 테이블 |
|--------|------|------------|
| ⭐ | 단방향/양방향 연관관계 | `orders` ↔ `order_items` |
| ⭐⭐ | 자기참조 트리 | `categories` |
| ⭐⭐ | 복합키 `@EmbeddedId` | `sku_option_values` |
| ⭐⭐ | 값 타입 임베디드 `@Embedded` | 주소 정보 (`member_addresses`) |
| ⭐⭐⭐ | 낙관적 락 `@Version` | `inventories` (동시 재고 차감) |
| ⭐⭐⭐ | 상속 매핑 `@DiscriminatorColumn` | `point_logs.change_type` |
| ⭐⭐⭐ | N+1 문제 & fetch join | `orders` → `order_items` → `sku` → `product` |
| ⭐⭐⭐ | 순환 참조 주의 | `orders` ↔ `coupon_usages` (양방향 참조 끊기) |
