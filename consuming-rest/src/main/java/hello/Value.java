package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setQuote(final String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{id=" + id + ", quote='" + quote + "'}";
    }
}
