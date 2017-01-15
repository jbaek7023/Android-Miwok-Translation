Miwok App
===================================

This app displays lists of vocabulary words for the user to learn the Miwok language.
Used in a Udacity course in the Beginning Android Nanodegree.

1. Word.java
```
/**
 * Created by jaemin on 17. 1. 15.
 */

public class Word {

    private String defaultTranslation;
    private String mMiworkTranslation;

    public Word(String defaultTranslation, String mMiworkTranslation){
        this.defaultTranslation = defaultTranslation;
        this.mMiworkTranslation = mMiworkTranslation;
    }

    /**
     * Getter and Setter
     * @return
     */
    public String getmMiworkTranslation() {
        return mMiworkTranslation;
    }

    public void setmMiworkTranslation(String mMiworkTranslation) {
        this.mMiworkTranslation = mMiworkTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

}
```

```
/**
 * Created by jaemin on 17. 1. 15.
 */

public class WordAdapter extends ArrayAdapter<Word>{


    public WordAdapter(Activity context, ArrayList<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        Word currentAndroidFlavor = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.defaultWord);
        nameTextView.setText(currentAndroidFlavor.getDefaultTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.translated);
        numberTextView.setText(currentAndroidFlavor.getmMiworkTranslation());


        return listItemView;
    }

}

```
3.list_view.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:baselineAligned="false"
    android:padding="16dp">
    <TextView
        android:id="@+id/defaultWord"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        tools:text="lutti"/>

    <TextView
        android:id="@+id/translated"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        tools:text="one"/>
</LinearLayout>
```
Pre-requisites
--------------

- Android SDK v23
- Android Build Tools v23.0.2
- Android Support Repository v23.3.0

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Support
-------

- Google+ Community: https://plus.google.com/communities/105153134372062985968
- Stack Overflow: http://stackoverflow.com/questions/tagged/android

Patches are encouraged, and may be submitted by forking this project and
submitting a pull request through GitHub. Please see CONTRIBUTING.md for more details.

License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
