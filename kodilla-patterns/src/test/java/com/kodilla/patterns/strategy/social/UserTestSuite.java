package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User blackMirror = new Millenials("blackmirror");
        User tom85 = new YGeneration("tom85");
        User mickey13 = new ZGeneration("mickey13");

        //When
        String blackMirrorUses = blackMirror.sharePost();
        System.out.println("User blackmirror uses " + blackMirrorUses);
        String tom85Uses = tom85.sharePost();
        System.out.println("User tom85 uses " + tom85Uses);
        String mickey13Uses = mickey13.sharePost();
        System.out.println("User mickey13 uses " + mickey13Uses);

        //Then
        Assert.assertEquals("Snapchat", blackMirrorUses);
        Assert.assertEquals("Facebook", tom85Uses);
        Assert.assertEquals("Twitter", mickey13Uses);
    }
}
