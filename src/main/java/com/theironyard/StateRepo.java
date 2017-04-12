package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by doug on 4/12/17.
 */
@Component
public class StateRepo {

    @Autowired
    JdbcTemplate template;

    public List<State> listStates() {
        return template.query("SELECT * FROM stateprovince;",
                (rs, row) -> new State(
                        rs.getInt("stateprovinceId"),
                        rs.getString("name")
                )
        );
    }

    public State getState(Integer id) {
        return template.queryForObject("SELECT * FROM stateprovince WHERE stateprovinceid = ?",
                new Object[]{id},
                (rs, row) -> new State(
                        rs.getInt("stateprovinceid"),
                        rs.getString("name")
                ));
    }

}
