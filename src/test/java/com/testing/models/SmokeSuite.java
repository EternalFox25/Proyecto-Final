package com.testing.models;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.testing")
@IncludeTags("smoke")
@ExcludeTags("regression")
public class SmokeSuite {
    //No va nada aquí adentro
}
