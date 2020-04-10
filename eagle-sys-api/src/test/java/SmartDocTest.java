import com.eagle.core.base.entity.EagleResponseCodeEnum;
import com.eagle.devtool.doc.builder.ApiDocBuilder;
import com.eagle.devtool.doc.model.ApiConfig;
import com.eagle.devtool.doc.model.ApiErrorCodeDictionary;
import com.eagle.devtool.doc.model.RevisionLog;
import org.junit.Test;
//测试一下
//重测
/**
 * <p><b>名称：</b></p>
 * <p><b>描述：</b></p>
 *
 * @author yaojx
 * @since 0.0.1
 */
public class SmartDocTest {
	@Test
	public void testBuilderControllersApi() {
		ApiConfig config = new ApiConfig();
		//设置为严格模式，Smart-doc将强制要求每个Controller暴露的接口写上标准文档注释
		config.setStrict(false);
		//当把AllInOne设置为true时，Smart-doc将会把所有接口生成到一个Markdown、HHTML或者AsciiDoc中
		config.setAllInOne(true);
		//生成文档输出路径
		config.setOutPath("e:\\api-md");
		// 设置接口包扫描路径过滤，如果不配置则Smart-doc默认扫描所有的接口类，配置多个包名英文逗号隔开
		config.setPackageFilters("com.eagle.sys.api");
		//设置文档变更记录，没有需要可以不设置
		config.setRevisionLogs(
				RevisionLog.getLog().setRevisionTime("2020/02/25").setAuthor("liuyj19").setRemarks("创建Web示例应用").setStatus("新建").setVersion("0.0.1-SNAPSHOT")
		);
		//设置错误错列表
		config.setErrorCodeDictionaries(
				ApiErrorCodeDictionary.dict().setEnumClass(EagleResponseCodeEnum.class)
						.setCodeField("code") //错误码值字段名
						.setDescField("msg")//错误码描述
		);
		config.setShowAuthor(true);
		config.setProjectName("演示如何使用DataMybatis组件");
		//生成Markdown文件
		ApiDocBuilder.builderControllersApi(config);
		
	}
}
