package jdbctemplate;

import java.sql.ResultSet;

/**
 * Created by mzcsh on 2019/3/19.
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs,int rowNum )throws  Exception;
}
