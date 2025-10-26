package com.example.workbook.domain.member.service;

import com.example.workbook.domain.member.entity.Member;
import com.example.workbook.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member findMemberInfo(Long memberId) {
        return memberRepository.findById(memberId).orElse(null);
    }

}
