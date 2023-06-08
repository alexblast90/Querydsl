package study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    //회원명,팀명,나이(ageGoe,ageLoe) 를 조건으로 해당하는 쿼리를 그때 그떄 뽑아오고 싶다(동적쿼리 사용!)

    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;

}
