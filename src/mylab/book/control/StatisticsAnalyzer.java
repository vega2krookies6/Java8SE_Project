package mylab.book.control;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import mylab.book.entity.Magazine;
import mylab.book.entity.Novel;
import mylab.book.entity.Publication;
import mylab.book.entity.ReferenceBook;

public class StatisticsAnalyzer {
    
    // 타입별 평균 가격을 계산하는 메서드
    public Map<String, Double> calculateAveragePriceByType(Publication[] publications) {
        Map<String, Double> totalPriceByType = new HashMap<>();
        Map<String, Integer> countByType = new HashMap<>();
        
        for (Publication pub : publications) {
            String type = getPublicationType(pub);
            
            // 현재 타입의 총 가격과 개수 업데이트
            totalPriceByType.put(type, totalPriceByType.getOrDefault(type, 0.0) + pub.getPrice());
            countByType.put(type, countByType.getOrDefault(type, 0) + 1);
        }
        
        // 평균 계산
        Map<String, Double> averagePriceByType = new HashMap<>();
        for (String type : totalPriceByType.keySet()) {
            double average = totalPriceByType.get(type) / countByType.get(type);
            averagePriceByType.put(type, average);
        }
        
        return averagePriceByType;
    }
    
    // 출판물 유형 분포를 계산하는 메서드 (%)
    public Map<String, Double> calculatePublicationDistribution(Publication[] publications) {
        Map<String, Integer> countByType = new HashMap<>();
        int totalCount = publications.length;
        
        for (Publication pub : publications) {
            String type = getPublicationType(pub);
            countByType.put(type, countByType.getOrDefault(type, 0) + 1);
        }
        
        // 백분율 계산
        Map<String, Double> distributionByType = new HashMap<>();
        for (String type : countByType.keySet()) {
            double percentage = (countByType.get(type) * 100.0) / totalCount;
            distributionByType.put(type, percentage);
        }
        
        return distributionByType;
    }
    
    // 특정 연도에 출판된 출판물 비율을 계산하는 메서드
    public double calculatePublicationRatioByYear(Publication[] publications, String year) {
        int countInYear = 0;
        int totalCount = publications.length;
        
        for (Publication pub : publications) {
            // publishDate 형식이 "yyyy-mm-dd"라고 가정
            String pubYear = pub.getPublishDate().substring(0, 4);
            if (pubYear.equals(year)) {
                countInYear++;
            }
        }
        
        return (countInYear * 100.0) / totalCount;
    }
    
    // 출판물의 타입을 문자열로 반환하는 헬퍼 메서드
    private String getPublicationType(Publication pub) {
        if (pub instanceof Novel) {
            return "소설";
        } else if (pub instanceof Magazine) {
            return "잡지";
        } else if (pub instanceof ReferenceBook) {
            return "참고서";
        } else {
            return "기타";
        }
    }
    
    // 모든 통계 정보를 출력하는 메서드
    public void printStatistics(Publication[] publications) {
        System.out.println("\n===== 출판물 통계 분석 =====");
        
        // 타입별 평균 가격
        Map<String, Double> avgPriceByType = calculateAveragePriceByType(publications);
        System.out.println("1. 타입별 평균 가격:");
        DecimalFormat df = new DecimalFormat("#,###.##");
        for (String type : avgPriceByType.keySet()) {
            System.out.println("   - " + type + ": " + df.format(avgPriceByType.get(type)) + "원");
        }
        
        // 출판물 유형 분포
        Map<String, Double> distribution = calculatePublicationDistribution(publications);
        System.out.println("\n2. 출판물 유형 분포:");
        for (String type : distribution.keySet()) {
            System.out.println("   - " + type + ": " + df.format(distribution.get(type)) + "%");
        }
        
        // 2007년도에 출판된 출판물 비율
        double ratio2007 = calculatePublicationRatioByYear(publications, "2007");
        System.out.println("\n3. 2007년에 출판된 출판물 비율: " + df.format(ratio2007) + "%");
        
        System.out.println("=============================");
    }
}