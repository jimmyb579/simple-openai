package io.github.sashirestela.openai.domain.embedding;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.sashirestela.slimvalidator.constraints.ObjectType;
import io.github.sashirestela.slimvalidator.constraints.Required;
import lombok.Builder;
import lombok.Getter;
import lombok.With;

@Getter
@Builder
@JsonInclude(Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EmbeddingRequest {

    @Required
    private String model;

    @Required
    @ObjectType(baseClass = String.class)
    @ObjectType(baseClass = String.class, firstGroup = true)
    @ObjectType(baseClass = Integer.class, firstGroup = true)
    @ObjectType(baseClass = Integer.class, firstGroup = true, secondGroup = true)
    private Object input;

    @With
    private EncodingFormat encodingFormat;

    private String user;

}
