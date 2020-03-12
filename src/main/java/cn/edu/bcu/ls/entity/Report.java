package cn.edu.bcu.ls.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="cn-edu-bcu-ls-entity-Report")
@Data
@NoArgsConstructor
public class Report {
    /**
    * 报告编号
    */
    @ApiModelProperty(value="报告编号")
    private Integer reportId;

    /**
    * 未到人用户编号
    */
    @ApiModelProperty(value="未到人用户编号")
    private Integer reportStudentId;

    /**
    * 报告发起人
    */
    @ApiModelProperty(value="报告发起人")
    private Integer reportTeacherId;

    /**
    * 报告时间
    */
    @ApiModelProperty(value="报告时间")
    private Date reportTime;

    /**
    * 报告备注
    */
    @ApiModelProperty(value="报告备注")
    private String reportRemark;
}