package racingcar.entity;

import javax.validation.constraints.NotNull;

public class RacingPlayerResponse {
    private final Long id;
    private final String name;

    public Long getId() {
        return id;
    }

    public RacingPlayerResponse(Long id, String name, Integer position, Boolean isWinner) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.isWinner = isWinner;
    }

    private final Integer position;
    private final Boolean isWinner;

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }

    public Boolean getWinner() {
        return isWinner;
    }

}
