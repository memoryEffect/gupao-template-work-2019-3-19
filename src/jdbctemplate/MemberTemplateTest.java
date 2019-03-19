package jdbctemplate;

import java.util.List;

/**
 * Created by mzcsh on 2019/3/19.
 */
public class MemberTemplateTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
