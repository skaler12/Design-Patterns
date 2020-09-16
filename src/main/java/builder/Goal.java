package builder;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;

public class Goal {
    private String name;
    private String description;
    private List<Level> levels;
    private LocalDate deadline;
    private boolean achieved;

    public static final class Builder {
        private String name;
        private String description;
        private List<Level> levels;
        private LocalDate deadline;
        private boolean achieved = false;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder levels(List<Level> levels) {
            this.levels = levels;
            return this;
        }


        public Builder deadline(LocalDate deadline) {
            this.deadline = deadline;
            return this;
        }

        public Builder achieved() {
            this.achieved = true;
            return this;
        }
        public Builder addLevel(Level level) {
            this.levels.add(level);
            return this;
        }

        public Goal build() {
            if(name.isEmpty()){
                throw new IllegalStateException("Name cannot be empty");
            }

            Goal goal = new Goal();
            goal.deadline = this.deadline;
            goal.name = this.name;
            goal.levels = this.levels;
            goal.description = this.description;
            goal.achieved = this.achieved;
            return goal;
        }
    }
}
