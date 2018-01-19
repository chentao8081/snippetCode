package json;

import com.alibaba.fastjson.JSONObject;

/**
 * @author chentao
 * @date 2017/12/12
 **/
public class JsonTest {
    public static void main(String[] args) {
//        String data = "{\"enterpriseMetas\":[{\"clientId\":\"log\",\"enterpriseId\":\"40288ae160498b030160498c4ed30000\",\"extra\":\"{\\\"agentCert\\\":\\\"upload/files\\\\\\\\20171211\\\\\\\\test.png\\\",\\\"agentIdCard\\\":\\\"upload/files\\\\\\\\20171211\\\\\\\\test.png\\\",\\\"agentIdCardBack\\\":\\\"upload/files\\\\\\\\20171211\\\\\\\\test.png\\\",\\\"agentIdCardFace\\\":\\\"upload/files\\\\\\\\20171211\\\\\\\\test.png\\\",\\\"bankAccount\\\":\\\"1\\\",\\\"bankAccountName\\\":\\\"1\\\",\\\"bankAccountType\\\":\\\"PERSON\\\",\\\"bankId\\\":\\\"17PUKtjyWHzbL7h3KUXds1\\\",\\\"bankName\\\":\\\"南充市商业银行\\\",\\\"businessNo\\\":\\\"123456789012345\\\",\\\"certType\\\":\\\"CERT_3IN1\\\",\\\"compName\\\":\\\"acenter\\\",\\\"compType\\\":\\\"provider\\\",\\\"createBy\\\":\\\"acenter\\\",\\\"createName\\\":\\\"acenter\\\",\\\"email\\\":\\\"2449149803@qq.com\\\",\\\"id\\\":\\\"40288aec60442c3a016044345eba0004\\\",\\\"idCard\\\":\\\"441900199002286931\\\",\\\"legalPerson\\\":\\\"蔡\\\",\\\"license\\\":\\\"upload/files\\\\\\\\20171211\\\\\\\\test.png\\\",\\\"linkman\\\":\\\"蔡\\\",\\\"mobile\\\":\\\"15522510350\\\",\\\"openId\\\":\\\"40288ae160498b030160498c4ed30000\\\",\\\"orgCode\\\":\\\"1\\\",\\\"orgCreditCode\\\":\\\"123456789012345\\\",\\\"state\\\":\\\"1\\\",\\\"sysCompanyCode\\\":\\\"A07\\\",\\\"sysOrgCode\\\":\\\"A07\\\",\\\"updateBy\\\":\\\"admin\\\",\\\"updateDate\\\":1513062422000,\\\"updateName\\\":\\\"管理员\\\"}\",\"id\":\"40288ae160498b030160498c4efe0001\",\"new\":false}],\"id\":\"40288ae160498b030160498c4ed30000\",\"name\":\"acenter\"}";
//        AcenterEnterpriseDTO enterpriseDTO = JSONObject.parseObject(data, AcenterEnterpriseDTO.class);

        String account = new StringBuilder(String.valueOf(System.currentTimeMillis())).append("@qq.com").toString();
        System.out.println(account);
    }
}
