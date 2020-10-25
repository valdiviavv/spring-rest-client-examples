
package guru.springframework.api.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@Document("list")
public class User implements Serializable
{

    @Id
    private String id;

    private String gender;

    @DBRef
    private Name name;

    @DBRef
    private Location location;

    private String email;
    @DBRef
    private Login login;

    private String phone;
    @DBRef
    private Job job;
    @DBRef
    private Billing billing;

    private String language;
    private String currency;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 270727596527329664L;
}
