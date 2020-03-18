package com.eagle.sys.api;

import java.util.HashMap;
import java.util.Map;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 *
 * @author luyy
 * @Description
 * @Classname SysManageConstant
 * @since 2019/12/19 23:46
 */
public class SysManageConstant {
	private SysManageConstant() {
	}
	//数据状态--有效
	public static final String STATUS_CD_VALID = "1000";
	//数据状态--无效
	public static final String STATUS_CD_INVALID = "1100";
	//数据状态--锁定
	public static final String STATUS_CD_LOCKED = "1200";
	//数据状态--暂停
	public static final String STATUS_CD_PAUSE = "1300";
	//数据状态--删除(该状态删除动作 逻辑删除)
	public static final String STATUS_CD_DEL = "1400";
	
	//权限类型--菜单
	public static final String PRIV_TYPE_MENU = "1000";
	//权限类型--功能
	public static final String PRIV_TYPE_FUNC = "1100";
	//权限类型--数据维度
	public static final String PRIV_TYPE_DATA_DIMENSION = "1200";
	//操作类型--停用
	public static final String OPER_TYPE_PAUSE = "1";

	//权限类型
	public static final String PRIV_TYPE_NBR = "STF-0002";
	//状态
	public static final String STATUS_CD_NBR = "STF-0003";

	//默认失效时间
	public static final String DEFAULT_EXP_DATE = "2099-01-01 00:00:00";

	//角色类型
	public static final String ROLE_TYPE_NBR = "STF-C-0012";

	//角色类型-分公司
	public static final String ROLE_TYPE_FGS = "1202";

	//维度类型
	public static final String BUSI_TYPE_NBR = "";

	//维度类型-SQL
	public static final String BUSI_TYPE_SQL = "10000";

	//维度类型-SERVICE
	public static final String BUSI_TYPE_SERVICE = "20000";

	//维度类型-JSON
	public static final String BUSI_TYPE_JSON = "30000";

    //权限关联对象类型-功能菜单
    public static final String PRIV_OBJ_REL_MENU = "10000";

    //权限关联对象类型-业务对象-数据维度
    public static final String PRIV_OBJ_REL_PRIVILEGE = "20000";

    //默认地区
    public static final Long DEFAULT_AREA = 8130100L;

    //菜单类型
    public static final String MENU_TYPE_NBR = "STF-C-0013";

    //授权对象类型-工号
    public static final String GRANG_OBJ_TYPE_STAFF = "10000";

	//授权对象类型-角色
	public static final String GRANG_OBJ_TYPE_ROLE = "20000";
	//密码有效时间
	public static final Long PWD_EFFECT_DAYS = 100L;
	//密码有效时间
	public static final Long PWD_ERROR_LIMIT_COUNT = 100L;

	//默认密码
	public static final String INIT_PASSWORD = "1QAZ!qaz";

	//密码有效
	public static final String EFF_PASSWORD_STATUS = "1000";
	/**
	 * 密码复杂性校验配置,支持配置多个正则表达式匹配校验
	 */

	public static volatile Map PASSWORD_RULE_CONFIG = new HashMap();
	static {
		PASSWORD_RULE_CONFIG.put("^(?![0-9a-z]+$)(?![0-9A-Z]+$)(?![0-9\\W]+$)(?![a-z\\W]+$)(?![a-zA-Z]+$)(?![A-Z\\W]+$)[a-zA-Z0-9\\W]{6,16}$"
				, "密码必须包含大写字母、小写字母、数字和符号其中三项！且必须6位~16位之间！");
	}
	
	//顶级菜单id
	public static final Long TOP_PAR_MENU_ID = 0L;
	
	//资源类型 子菜单
	public static final String MENU_TYPE_MENU_CHILD = "1100";
	//资源类型 子菜单
	public static final String MENU_TYPE_MENU_PAR = "1000";
	//资源类型 功能点/url
	public static final String MENU_TYPE_MENU_FUNC= "1200";
	//角色类型
	public static final Long MENU_TYPE_ATTR_OBJ_ID = 200020L;
	//公告等级
	public static final Long BULLETIN_LEVEL_ATTR_OBJ_ID = 200032L;
	//员工类型
	public static final Long STAFF_TYPE = 200016L;
	//外部員工
	public static final String OUT_STAFF_TYPE= "1100";
	//超级管理员
	public static final String SUPER_MANAGER= "SUPER_MANAGER";

	//默认分页参数
	public static final Integer INIT_PAGE_INDEX = 1;
	public static final Integer INIT_PAGE_SIZE = 10;

	//员工组织关系 聘用
	public static final String STAFF_ORG_TYPE_PY = "1000";

	// 地区权限
	public static final String AREA_PRIV = "AREA_PRIV";


	// 查看组织内所有商机权限
	public static final String QRY_ORG_BUSI = "SALESFUNC001";

	// 是否是crm同步员工
	public static volatile Integer COMM_YES = 1;
	public static volatile Integer COMM_NO = 0;

	// 文件存储方式-FTP存储
	public static final String STORE_TYPE_FTP = "1100";
}
