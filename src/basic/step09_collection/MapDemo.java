package basic.step09_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 9단계 : Map (HashMap) 과 Set
 *
 * mylab.book.control.StatisticsAnalyzer 가 타입별 개수/합계를 셀 때 쓰는 자료구조다.
 * Map 은 "키 → 값" 쌍을 저장하며 키는 중복될 수 없다.
 */
public class MapDemo {

	public static void main(String[] args) {

		// 1. 생성과 저장
		Map<String, Integer> stock = new HashMap<>();
		stock.put("소설", 5);
		stock.put("잡지", 3);
		stock.put("참고서", 7);
		stock.put("소설", 10); // 같은 키에 다시 put 하면 값이 덮어써진다.
		System.out.println(stock);

		// 2. 조회
		System.out.println("소설 재고     : " + stock.get("소설"));
		System.out.println("없는 키       : " + stock.get("만화"));            // null
		System.out.println("기본값 사용   : " + stock.getOrDefault("만화", 0)); // 0
		System.out.println("키 존재 여부  : " + stock.containsKey("잡지"));
		System.out.println("크기          : " + stock.size());

		// 3. 삭제
		stock.remove("참고서");
		System.out.println("삭제 후 : " + stock);

		// 4. 순회 방법
		//    (1) 키만 순회 (StatisticsAnalyzer 가 쓰는 방식)
		for (String key : stock.keySet()) {
			System.out.println(key + " → " + stock.get(key));
		}
		//    (2) 키와 값을 한 번에 (더 효율적)
		for (Map.Entry<String, Integer> entry : stock.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		System.out.println("---------------------------------");

		// 5. ★핵심 패턴★ 개수 세기 (getOrDefault 활용)
		String[] types = { "소설", "잡지", "소설", "참고서", "소설", "잡지" };
		Map<String, Integer> countByType = new HashMap<>();
		for (String type : types) {
			// 기존 값이 없으면 0 에서 시작, 있으면 +1
			countByType.put(type, countByType.getOrDefault(type, 0) + 1);
		}
		System.out.println("타입별 개수 : " + countByType);

		// 6. ★핵심 패턴★ 합계 → 평균 구하기
		String[] names = { "소설", "잡지", "소설", "참고서" };
		int[] prices = { 11000, 9900, 12000, 25000 };

		Map<String, Double> totalByType = new HashMap<>();
		Map<String, Integer> cntByType = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			totalByType.put(names[i], totalByType.getOrDefault(names[i], 0.0) + prices[i]);
			cntByType.put(names[i], cntByType.getOrDefault(names[i], 0) + 1);
		}

		Map<String, Double> averageByType = new HashMap<>();
		for (String type : totalByType.keySet()) {
			averageByType.put(type, totalByType.get(type) / cntByType.get(type));
		}
		for (String type : averageByType.keySet()) {
			System.out.printf("%s 평균가 : %,.1f원%n", type, averageByType.get(type));
		}

		System.out.println("---------------------------------");

		// 7. Set : 중복을 허용하지 않는 모음. 순서는 보장되지 않는다.
		Set<String> uniqueTypes = new HashSet<>();
		for (String type : types) {
			uniqueTypes.add(type);
		}
		System.out.println("중복 제거 : " + uniqueTypes);
		System.out.println("포함 여부 : " + uniqueTypes.contains("소설"));
	}
}
