package com.praktikum.users;

import com.praktikum.actions.UserActions;
import java.util.Scanner;

public abstract class User  {
    protected String name;
    protected int id;
    public static Scanner input = new Scanner(System.in);

    @Override
    public abstract void login();
    }

//Displayappmenu abstract class