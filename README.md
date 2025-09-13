SMD Assignment 1 — “Socially” (Android)

Author: Amna Tahir 
Package: com.example.smd_a1
Repo: https://github.com/amntahir/smd-assignment-1

Overview

This project implements core screens and flows of a social app (“Socially”): feed, profile, stories, messaging entry points, and related UI elements. The focus is on accurate UI reproduction, simple navigation, and basic instrumentation tests to demonstrate reliability.

Tech stack
-Android Studio (with bundled JBR)
-Kotlin, AndroidX
-Gradle (Kotlin DSL)
-UI: ConstraintLayout, ScrollView, CardView, simple widgets
-Testing: JUnit4, AndroidX Test, Espresso

Included tests:
-NavSmokeTest — launches MainActivity and passes if it doesn’t crash.
-BottomBarTest — asserts the activity’s root (android.R.id.content) is displayed.

Screens (high level)
-Login / Register
-Feed & Explore (grid/masonry tiles)
-Profile & Edit Profile
-Stories: add / view
-Misc screens via bottom navigation and quick filters

Version control
-Descriptive commit messages
-.gitignore excludes: .gradle/, .idea/, app/build/, local.properties, Submission/
