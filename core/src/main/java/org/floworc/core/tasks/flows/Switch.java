package org.floworc.core.tasks.flows;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.floworc.core.models.tasks.FlowableTask;
import org.floworc.core.models.tasks.Task;

import java.util.List;
import java.util.Map;

@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Getter
@FieldDefaults(level= AccessLevel.PROTECTED)
@AllArgsConstructor
public class Switch extends Task implements FlowableTask {
    private Map<String, List<Task>> cases;

    private List<Task> defaults;
}
