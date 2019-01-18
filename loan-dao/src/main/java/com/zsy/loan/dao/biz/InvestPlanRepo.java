
package com.zsy.loan.dao.biz;

import com.zsy.loan.bean.entity.biz. TBizInvestPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 回款计划Repo
 *
 * @Author zhangxh
 * @Date 2019-01-18  12:35
 */
public interface InvestPlanRepo extends PagingAndSortingRepository< TBizInvestPlan, Long>
    , JpaRepository< TBizInvestPlan, Long>, JpaSpecificationExecutor< TBizInvestPlan> {

}