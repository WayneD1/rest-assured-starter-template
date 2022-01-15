package models;

public class Chore {

  private Long id;
  private String choreName;
  private String choreDescription;
  private String doneBy;
  private Integer difficulty;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getChoreName() {
    return choreName;
  }

  public void setChoreName(String choreName) {
    this.choreName = choreName;
  }

  public String getChoreDescription() {
    return choreDescription;
  }

  public void setChoreDescription(String choreDescription) {
    this.choreDescription = choreDescription;
  }

  public String getDoneBy() {
    return doneBy;
  }

  public void setDoneBy(String doneBy) {
    this.doneBy = doneBy;
  }

  public Integer getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }
}
