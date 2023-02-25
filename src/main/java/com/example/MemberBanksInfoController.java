/*
package com.example;

import java.util.Comparator;
import java.util.stream.Collectors;

public class MemberBanksInfoController {
    public ResponseVO<Object> getMemberBanksInfoByMemberInfoId (@RequestBody MemberBanksInfoDto dto){
        for(MemberBanksInfo memberbanksInfo : memberBanksInfoServiceV2.queryByMemberId(dto.getId))){
            xsS2tomemberBanksInfoMap.put(memberBanksInfo.getXsS2(),memberBanksInfo);
        }
        for(MemberBanksInfo memberBanksDelete : memberBanksInfoServiceV2.queryDeletedByMemberId)(dto.getId))){
    if(xsS2ToMemberBanksInfoMap.containsKey(memberBanksDelete.getXsS2())){
        xsS2ToMemberBanksInfoMap.get(memberBanksDelete.getXsS2()).setDeletedAt(memberBanksDelete.getDeletedAt())''
    }
    else{
        xsS2ToMemberBanksInfoMap.put(memberBanksDelete.getXsS2(),memberBanksDelete);

    }
        }
        List<MemberBanksInfo > list = xsS2ToMemberBanksInfoMap.values().stream()
                .sorted(Comparator.comparing(MemberBanksInfo::getIsDefault, Comparator.reverseOrder())
                .limit(10)
                .collect(Collectors.toList());
    }
    return ResponseHelper.success(list)
}
*/
