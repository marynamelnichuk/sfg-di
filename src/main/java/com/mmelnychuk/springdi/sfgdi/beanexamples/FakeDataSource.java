/*
 * Created 2020, 8, 28
 * by Maryna Melnychuk
 */

package com.mmelnychuk.springdi.sfgdi.beanexamples;

public class FakeDataSource {

    private String userName;
    private String password;
    private String databaseUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }
}
