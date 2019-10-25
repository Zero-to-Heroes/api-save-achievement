package com.zerotoheroes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "achievement_stat", indexes = {
        @Index(columnList = "creationDate", name = "ix_creationDate"),
        @Index(columnList = "userId", name = "ix_userId"),
        @Index(columnList = "userMachineId", name = "ix_userMachineId"),
        @Index(columnList = "achievementId", name = "ix_achievementId"),
        @Index(columnList = "userName", name = "ix_userName"),
        @Index(columnList = "name", name = "ix_name"),
        @Index(columnList = "type", name = "ix_type"),
        @Index(columnList = "cardId", name = "ix_cardId"),
        @Index(columnList = "numberOfCompletions", name = "ix_numberOfCompletions"),
        @Index(columnList = "reviewId", name = "ix_reviewId"),
})
@AllArgsConstructor()
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AchievementStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    private String userId;
    private String userMachineId;
    private String achievementId;
    private String userName;
    private String name;
    private String type;
    private String cardId;
    private int numberOfCompletions;
    private String reviewId;

    private AchievementStat() {
        // Needed by JPA
    }
}
