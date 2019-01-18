package com.zsy.loan.bean.entity.biz;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 转账凭证表
 *
 * @Author zhangxh
 * @Date 2019-01-18  12:30
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_biz_transfer_voucher_info", schema = "loan", catalog = "")
public class TBizTransferVoucherInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Basic
  @Column(name = "in_acct_no")
  private long inAcctNo;

  @Basic
  @Column(name = "out_acct_no")
  private long outAcctNo;

  @Basic
  @Column(name = "amt")
  private BigDecimal amt;

  @Basic
  @Column(name = "type")
  private long type;

  @Basic
  @Column(name = "status")
  private long status;

  @Basic
  @Column(name = "operator")
  private long operator;

  @Basic
  @Column(name = "create_at")
  private Timestamp createAt;

  @Basic
  @Column(name = "update_at")
  private Timestamp updateAt;

  @Id
  @Column(name = "id")
  public long getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    TBizTransferVoucherInfo that = (TBizTransferVoucherInfo) o;

    if (id != that.id) {
      return false;
    }
    if (inAcctNo != that.inAcctNo) {
      return false;
    }
    if (outAcctNo != that.outAcctNo) {
      return false;
    }
    if (type != that.type) {
      return false;
    }
    if (status != that.status) {
      return false;
    }
    if (operator != that.operator) {
      return false;
    }
    if (amt != null ? !amt.equals(that.amt) : that.amt != null) {
      return false;
    }
    if (createAt != null ? !createAt.equals(that.createAt) : that.createAt != null) {
      return false;
    }
    if (updateAt != null ? !updateAt.equals(that.updateAt) : that.updateAt != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = (int) (id ^ (id >>> 32));
    result = 31 * result + (int) (inAcctNo ^ (inAcctNo >>> 32));
    result = 31 * result + (int) (outAcctNo ^ (outAcctNo >>> 32));
    result = 31 * result + (amt != null ? amt.hashCode() : 0);
    result = 31 * result + (int) (type ^ (type >>> 32));
    result = 31 * result + (int) (status ^ (status >>> 32));
    result = 31 * result + (int) (operator ^ (operator >>> 32));
    result = 31 * result + (createAt != null ? createAt.hashCode() : 0);
    result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
    return result;
  }
}