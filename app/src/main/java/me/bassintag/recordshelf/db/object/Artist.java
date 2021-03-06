package me.bassintag.recordshelf.db.object;

/*
** Created by Antoine on 02/09/2017.
*/
public class Artist extends DatabaseObject {

  private String mName;

  public Artist(int id, String name) {
    super(id);
    mName = name;
  }

  public Artist(String name) {
    super(-1);
    mName = name;
  }

  public String getName() {
    return mName;
  }

  public void setName(String name) {
    this.mName = name;
  }
}
