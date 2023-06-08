package study.querydsl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);



    //스프링 데이터 JPA와 Querydsl을 조합해서 페이징 처리를 해보자

    //fetchResult로 카운트까지 한번에
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);

    //복잡한코드에서 카운트랑 쿼리 따로따로
    Page<MemberTeamDto> searcPageComplex(MemberSearchCondition condition, Pageable pageable);



}
