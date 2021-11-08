package user;

import lombok.Getter;
import java.util.UUID;

@Getter
public class Sender implements User {
    private boolean status;
    private UUID id;

    public Sender() {
        this.setId();
    }

    public void update() {
        this.status = true;
    }

    public void setId() {
        this.id = UUID.randomUUID();
    }

    public boolean getStatus() {
        return status;
    }
}
