/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * /**
 * Sources for Course and Project 6:
 * <p/>
 * Set up Android wear
 * http://developer.android.com/training/wearables/apps/creating.html
 * https://developer.android.com/training/wearables/apps/creating.html
 * http://stackoverflow.com/questions/25621818/no-missing-feature-watch-when-i-try-to-run-my-smartphone-app-with-wear-app
 * http://stackoverflow.com/questions/28533786/unable-to-run-sample-android-wear-app-on-physical-device
 * http://stackoverflow.com/questions/22489398/unsupported-major-minor-version-52-0
 * http://stackoverflow.com/questions/35937875/unsupported-major-minor-version-52-0-when-rendering-in-android-studio
 * http://stackoverflow.com/questions/30812493/adb-exe-not-found-after-installing-android-studio
 * https://www.rootusers.com/how-to-enable-the-telnet-client-in-windows-10/
 * http://developer.android.com/training/wearables/apps/creating.html
 * http://stackoverflow.com/questions/25205888/pairing-android-and-wear-emulators
 * http://developer.android.com/training/auto/messaging/index.html
 * <p/>
 * <p/>
 * Notifications
 * https://developer.android.com/training/wearables/notifications/stacks.html
 * Sources from previous projects have been used as reference material
 * <p/>
 * All course videos from Project 6 and WatchFace Sample Project
 * http://stackoverflow.com/questions/33304433/what-to-use-on-handheld-side-to-get-data-for-wearable
 * https://developers.google.com/android/reference/com/google/android/gms/wearable/WearableListenerService#inherited-constant-summary
 * https://developer.android.com/training/wearables/data-layer/events.html
 * http://stackoverflow.com/questions/26479193/sending-data-from-an-activity-to-wearablelistenerservice
 * https://developer.android.com/training/wearables/data-layer/messages.html
 * https://developer.android.com/training/wearables/data-layer/data-items.html
 * http://stackoverflow.com/questions/28928661/attempt-to-invoke-virtual-method-android-os-looper-android-content-context-getm
 * https://developer.android.com/training/run-background-service/create-service.html
 * https://developer.android.com/guide/components/services.html
 * https://developer.android.com/training/wearables/watch-faces/service.html
 * http://stackoverflow.com/questions/4765517/start-service-in-android
 * https://nullpointer.wtf/android-wear/watch-face-with-preview-phone-app/
 * http://stackoverflow.com/questions/29481292/nullpointerexception-when-creating-googleapiclient-instance
 * https://developers.google.com/android/reference/com/google/android/gms/wearable/Wearable#nested-class-summary
 * https://developers.google.com/android/reference/com/google/android/gms/common/api/GoogleApiClient.Builder#public-constructors
 * http://stackoverflow.com/questions/29481292/nullpointerexception-when-creating-googleapiclient-instance
 * https://developers.google.com/android/reference/com/google/android/gms/common/api/GoogleApiClient.Builder#public-constructors
 * https://developers.google.com/android/guides/api-client#handle_connection_failures
 * http://stackoverflow.com/questions/29481292/nullpointerexception-when-creating-googleapiclient-instance
 * https://developer.android.com/training/wearables/data-layer/data-items.html
 * http://android-developers.blogspot.co.at/2014/02/new-client-api-model-in-google-play.html
 * http://stackoverflow.com/questions/31324610/googleapiclient-node-is-null
 * http://stackoverflow.com/questions/28128946/caused-by-java-lang-nullpointerexception-attempt-to-invoke-interface-method-on
 * http://stackoverflow.com/questions/28986340/nullpointerexception-attempt-to-invoke-virtual-method-android-content-context-g
 * https://developer.android.com/training/wearables/data-layer/data-items.html
 * https://classroom.udacity.com/nanodegrees/nd801/parts/80113454012/modules/463237913875460/lessons/4582940110/concepts/45808002890923
 * http://stackoverflow.com/questions/25141046/wearablelistenerservice-ondatachanged-is-not-called
 * https://developer.android.com/guide/topics/resources/accessing-resources.html
 * (Android Source Code as an example for reading resources and getting drawables)
 * http://stackoverflow.com/questions/22853950/how-to-create-a-drawable-from-an-image-in-assets-folder
 * http://stackoverflow.com/questions/4884882/is-it-possible-to-load-a-drawable-from-the-assets-folder
 * http://stackoverflow.com/questions/11734803/load-an-image-from-assets-folder
 * http://stackoverflow.com/questions/9563373/the-reason-for-assets-and-raw-resources-in-android
 * http://stackoverflow.com/questions/6335189/android-how-to-show-images-from-resources-drawable
 * http://stackoverflow.com/questions/4955268/how-to-set-a-bitmap-from-resource
 * http://stackoverflow.com/questions/8501309/android-get-bitmap-or-sound-from-assets
 * file:///C:/Users/Christian/AppData/Local/Android/sdk/docs/reference/android/graphics/Paint.html
 * https://developer.android.com/training/wearables/data-layer/assets.html
 * https://developer.android.com/training/wearables/data-layer/events.html
 * http://stackoverflow.com/questions/29481292/nullpointerexception-when-creating-googleapiclient-instance
 * http://stackoverflow.com/questions/25141046/wearablelistenerservice-ondatachanged-is-not-called
 * http://stackoverflow.com/questions/24676165/unable-to-push-data-to-android-wear-emulator
 * http://stackoverflow.com/questions/18284874/service-version-update-required-and-google-play-service-out-of-date-while-integr
 * http://stackoverflow.com/questions/18284874/service-version-update-required-and-google-play-service-out-of-date-while-integr
 * http://stackoverflow.com/questions/28479849/when-does-isgoogleplayservicesavailable-return-service-version-update-required
 * http://stackoverflow.com/questions/13691943/this-app-wont-run-unless-you-update-google-play-services-via-bazaar
 * http://stackoverflow.com/questions/4837715/how-to-resize-a-bitmap-in-android
 * <p/>
 * <p/>
 * Sources specifically for "Make Your App Material":
 * Udacity Course on "Make your app material"
 * FAB Elevation: http://stackoverflow.com/questions/30532863/how-to-add-shadow-to-the-fab-provided-with-the-android-support-design-library
 * http://stackoverflow.com/questions/31328695/what-is-the-difference-between-appbarlayout-vs-toolbar
 * http://developer.android.com/reference/android/support/design/widget/CoordinatorLayout.html
 * http://developer.android.com/reference/android/support/design/widget/AppBarLayout.html
 * https://lab.getbase.com/introduction-to-coordinator-layout-on-android/
 * Styles/Themes: http://developer.android.com/guide/topics/ui/themes.html
 * https://color.adobe.com/de/create/color-wheel/?base=2&rule=Complementary&selected=4&name=Mein%20Color-Thema&mode=rgb&rgbvalues=0.18823529411764706,0.24705882352941178,0.6235294117647059,0.09999999999999998,0.22162162162189813,1,0,0.1351351351354424,1,0.7,0.5367480383607244,0,1,0.766782911943892,0&swatchOrder=0,1,2,3,4
 * http://www.google.com/design/spec/style/color.html#color-color-palette
 * http://developer.android.com/guide/topics/ui/themes.html
 * http://developer.android.com/guide/topics/manifest/manifest-intro.html
 * http://stackoverflow.com/questions/32441392/why-apptheme-is-not-working-tn-xml-file
 * http://www.google.com/design/spec/style/color.html#color-color-palette
 * http://developer.android.com/guide/topics/resources/overview.html
 * http://www.google.com/design/spec/what-is-material/elevation-shadows.html#elevation-shadows-elevation-android-
 * http://developer.android.com/reference/android/support/design/widget/CoordinatorLayout.html
 * https://lab.getbase.com/introduction-to-coordinator-layout-on-android/
 * http://stackoverflow.com/questions/30533444/appbarlayout-with-framelayout-container-as-scrolling-content-doesnt-work
 * http://stackoverflow.com/questions/34992671/android-view-hidden-behind-appbarlayout
 * https://guides.codepath.com/android/Using-the-App-ToolBar
 * http://developer.android.com/guide/topics/ui/layout/linear.html
 * http://stackoverflow.com/questions/26464326/how-do-i-make-drawerlayout-to-display-below-the-toolbar
 * http://stackoverflow.com/questions/23644528/swiperefreshlayout-is-hidden-behind-actionbar-with-transparent-status-bars
 * http://stackoverflow.com/questions/33422236/how-to-make-toolbar-not-overlap-other-content-in-android
 * http://stackoverflow.com/questions/26692233/what-is-the-app-android-xml-namespace
 * https://github.com/udacity/ud862-samples/tree/master/ImmersiveImages
 * https://github.com/udacity/ud862-samples/blob/master/ImmersiveImages/app/src/main/java/com/udacity/immersiveimages/MainActivity.java
 * http://stackoverflow.com/questions/30969455/android-changing-floating-action-button-color
 * http://www.google.com/design/spec/material-design/introduction.html
 * http://stackoverflow.com/questions/33127720/how-to-enable-disable-toolbar-scrolling-programmatically-when-using-design-suppo
 * http://sourcey.com/android-custom-centered-actionbar-with-material-design/
 * http://stackoverflow.com/questions/27568258/default-action-bar-elevation
 * https://www.reddit.com/r/androiddev/comments/2vd02k/what_should_be_the_default_elevation_for_toolbar/
 * http://www.google.com/design/spec/what-is-material/elevation-shadows.html#elevation-shadows-elevation-android-
 * http://stackoverflow.com/questions/26997109/setting-elevation-in-xml-on-appcompat-cardview-on-android-5-0
 * http://stackoverflow.com/questions/26997109/setting-elevation-in-xml-on-appcompat-cardview-on-android-5-0
 * http://stackoverflow.com/questions/24690727/androidelevation-doesnt-work-in-l-preview
 * https://guides.codepath.com/android/Using-the-CardView
 * http://www.google.com/design/spec/components/cards.html#cards-usage
 * http://www.google.com/design/spec/style/color.html#color-color-schemes
 * http://blog.danlew.net/2014/11/19/styles-on-android/
 * http://developer.android.com/guide/topics/ui/themes.html#DefiningStyles
 * http://javatechig.com/android/android-styles-and-themes-tutorial
 * https://color.adobe.com/de/create/color-wheel/?base=2&rule=Complementary&selected=1&name=Mein%20Color-Thema&mode=rgb&rgbvalues=0.32941176470588235,0.43137254901960786,0.47843137254901963,0.09999999999999998,0.7157894736840489,1,0,0.68421052631561,1,0.7,0.38111111111129503,0,1,0.5444444444447072,0&swatchOrder=0,1,2,3,4
 * https://www.google.com/design/spec/style/color.html#color-color-palette
 * http://stackoverflow.com/questions/13539688/how-to-use-roboto-font-in-android-project
 * https://www.google.com/design/spec/resources/roboto-noto-fonts.html
 * http://stackoverflow.com/questions/19113420/roboto-font-for-android-4
 * <p/>
 * <p/>
 * Sources specifically for BuildItBigger:
 * <p/>
 * Sources Build it bigger
 * Sources and Course contents from Udacity courses
 * First review of project
 * http://stackoverflow.com/questions/16601299/how-to-create-a-library-project-in-android-studio-and-an-application-project-tha
 * http://stackoverflow.com/questions/19294663/cannot-build-android-project-using-android-studio-gradle-1-7
 * http://stackoverflow.com/questions/24662801/bad-class-file-magic-or-version
 * http://developer.android.com/guide/components/intents-filters.html
 * http://stackoverflow.com/questions/4233873/how-do-i-get-extra-data-from-intent-on-android
 * http://stackoverflow.com/questions/32075498/error-retrieving-parent-for-item-no-resource-found-that-matches-the-given-name
 * https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
 * https://classroom.udacity.com/nanodegrees/nd801/parts/8011345407/modules/429520885375461/lessons/4295208853239847/concepts/42732622150923
 * http://stackoverflow.com/questions/29045129/android-java-exe-finished-with-non-zero-exit-value-1
 * http://stackoverflow.com/questions/32931636/errorexecution-failed-for-task-execexception-process-command-c-program-fil
 * http://stackoverflow.com/questions/23552706/deploy-app-engine-from-android-studio
 * http://stackoverflow.com/questions/29391421/android-studio-gradle-takes-too-long-to-build
 * https://developers.google.com/android/guides/setup#add_google_play_services_to_your_project
 * https://developers.google.com/android/guides/setup
 * https://developers.google.com/app-indexing/android/publish#add-google-play-services
 * https://developers.google.com/app-indexing/
 * https://software.intel.com/en-us/android/articles/installation-instructions-for-intel-hardware-accelerated-execution-manager-mac-os-x
 * http://www.sysprobs.com/disable-enable-virtualization-technology-bios
 * https://downloadcenter.intel.com/download/7838/Intel-Processor-Identification-Utility-Windows-Version
 * https://www.youtube.com/watch?v=c2c19WGuKjU
 * https://forums.lenovo.com/t5/Lenovo-Yoga-Series-Notebooks/Yoga-3-Pro-Accessing-BIOS-boot-menu-and-System-Recovery/ta-p/1809313
 * http://stackoverflow.com/questions/25629368/how-to-fix-android-studio-getting-stuck-executing-gradle-tasks
 * http://stackoverflow.com/questions/27707436/android-studio-predexdebug-and-predexrelease-get-stuck
 * http://stackoverflow.com/questions/25629368/how-to-fix-android-studio-getting-stuck-executing-gradle-tasks
 * http://stackoverflow.com/questions/23847482/error-gradle-execution-failed-for-task-apppredexdebug
 * http://stackoverflow.com/questions/25828524/android-studio-predexdebug-failed
 * https://discussions.udacity.com/t/best-practice-for-ui-programming/43519/3
 * https://discussions.udacity.com/t/execution-failed-for-task-app-predexdebug-in-step-1/24243
 * https://discussions.udacity.com/t/out-of-memory-error-when-building-p4/159139
 * http://stackoverflow.com/questions/26718825/how-to-resolve-java-util-zip-zipexception
 * http://stackoverflow.com/questions/34624732/gradle-duplicate-entries-build-failed
 * http://stackoverflow.com/questions/28168063/gradle-duplicate-entry-java-util-zip-zipexception
 * https://discussions.udacity.com/t/gradle-build-failed/157244/3
 * https://discuss.gradle.org/t/how-to-exclude-transitive-dependency/2119
 * https://maven.apache.org/guides/mini/guide-naming-conventions.html
 * http://stackoverflow.com/questions/33262470/error-compiling-android-project-after-updating-findbugs-to-3-0-1
 * http://stackoverflow.com/questions/5839359/java-lang-outofmemoryerror-gc-overhead-limit-exceeded/33854389#33854389
 * http://developer.android.com/tools/building/multidex.html
 * https://developers.google.com/api-client-library/java/google-api-java-client/setup#eclipse
 * http://stackoverflow.com/questions/13565399/which-is-better-to-work-upon-among-async-task-runnable-and-handler-in-android/13565929#13565929
 * https://discussions.udacity.com/t/zipexception-while-running-gradle-build/163671/2
 * http://stackoverflow.com/questions/2321829/android-asynctask-testing-with-android-test-framework
 * http://stackoverflow.com/questions/11944141/cannot-call-asynctask-doinbackground-and-onpostexecute
 * http://www.checkupdown.com/status/E504_de.html
 * http://stackoverflow.com/questions/10665113/android-app-not-showing-in-the-emulator
 * http://stackoverflow.com/questions/5165705/my-app-doesnt-appear-in-the-avd-after-running-from-eclipse
 * https://discussions.udacity.com/t/yet-another-getting-failed-to-connect-to-10-0-2-2-port-8080/35770
 * http://stackoverflow.com/questions/5590203/create-free-paid-versions-of-application-from-same-code
 * http://stackoverflow.com/questions/4740319/bulk-publishing-of-android-apps/4740728#4740728
 * https://developer.android.com/tools/projects/index.html#LibraryProjects
 * https://classroom.udacity.com/nanodegrees/nd801/parts/8011345407/modules/429520885375460/lessons/4020658782/concepts/43306600480923
 * http://stackoverflow.com/questions/33905687/error-file-path-too-long-on-windows-keep-below-240-characters
 * http://www.voidcn.com/blog/goodmentc/article/p-5751661.html
 * http://stackoverflow.com/questions/6900437/android-app-unable-to-start-activity-componentinfo
 * http://www.android-hilfe.de/thema/unable-to-start-activity-componentinfo.54254/
 * http://developer.android.com/tools/help/app-link-indexing.html
 * http://developer.android.com/tools/help/app-link-indexing.html#lint
 * https://classroom.udacity.com/nanodegrees/nd801/parts/8011345407/modules/429520885375460/lessons/3983839023/concepts/43260001280923
 * https://discussions.udacity.com/t/unable-to-start-fragment/163809/2
 * https://discussions.udacity.com/t/paid-flavour---java-file-appears-in-red-without-error-and-intellisence-is-not-working/30872
 * http://developer.android.com/tools/help/app-link-indexing.html
 * <p/>
 * Sources Super Duo and Stock Hawk:
 * http://stackoverflow.com/questions/6327483/implement-bar-code-scanner-in-android
 * http://stackoverflow.com/questions/27851512/how-to-integrate-zxing-library-to-android-studio-for-barcode-scanning
 * http://stackoverflow.com/questions/2050263/using-zxing-to-create-an-android-barcode-scanning-app
 * http://stackoverflow.com/questions/7233453/zxing-how-to-scan-qr-code-and-1d-barcode
 * http://stackoverflow.com/questions/32807587/com-android-build-transform-api-transformexception/32826010#32826010
 * http://stackoverflow.com/questions/32807587/com-android-build-transform-api-transformexception
 * https://github.com/zxing/zxing/
 * https://www.prahladyeri.com/blog/2013/11/three-steps-to-integrate-barcode-scanning-in-your-android-app.html
 * http://code.tutsplus.com/tutorials/android-sdk-create-a-barcode-reader--mobile-17162
 * http://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.0
 * http://stackoverflow.com/questions/17567326/how-does-getcontentresolver-work
 * https://github.com/diogobernardino/WilliamChart/blob/master/sample/src/com/db/williamchartdemo/linechart/LineCardTwo.java
 * https://github.com/diogobernardino/WilliamChart/wiki/%283%29-Line-Chart
 * http://www.survivingwithandroid.com/2014/06/android-chart-tutorial-achartengine.html
 * http://www.truiton.com/2015/04/android-chart-example-mp-android-chart-library/
 * https://github.com/PhilJay/MPAndroidChart
 * https://github.com/PhilJay/MPAndroidChart/blob/master/MPChartExample/src/com/xxmassdeveloper/mpchartexample/LineChartActivity1.java
 * https://github.com/diogobernardino/WilliamChart/wiki/%283%29-Line-Chart
 * http://stackoverflow.com/questions/33562611/found-com-google-android-gmsplay-services-gcm8-3-0-but-version-8-1-0-is-neede
 * http://stackoverflow.com/questions/34220288/failed-to-find-com-google-android-gmsplay-services-gcm8-3-0
 * https://developers.google.com/android/guides/releases
 * https://www.versioneye.com/java/com.google.android.gms:play-services-measurement/8.3.0
 * https://github.com/googlesamples/google-services/issues/107
 * https://github.com/googlesamples/google-services/issues/107
 * http://developer.android.com/design/patterns/widgets.html
 * http://dharmangsoni.blogspot.co.at/2014/03/collection-widget-with-event-handling.html
 * https://www.udacity.com/course/viewer#!/c-ud855-nd/l-4299539001/m-4310354606
 * http://developer.android.com/guide/topics/appwidgets/index.html
 * http://developer.android.com/training/load-data-background/handle-results.html
 * http://stackoverflow.com/questions/8903104/how-to-use-cursor-loader-to-access-retrieved-data
 * http://stackoverflow.com/questions/27211255/automatic-layout-mirroring-in-right-to-left-locale-with-lollipop
 * http://stackoverflow.com/questions/9730673/missing-contentdescription-attribute-on-image-in-xml
 * http://stackoverflow.com/questions/4238921/detect-whether-there-is-an-internet-connection-available-on-android
 * http://stackoverflow.com/questions/28217436/how-to-show-an-empty-view-with-a-recyclerview
 * http://stackoverflow.com/questions/12483508/setemptyview-on-listview-not-showing-its-view-in-a-android-app
 * http://stackoverflow.com/questions/4088711/android-listview-default-text-when-no-items
 * http://stackoverflow.com/questions/4162447/android-java-lang-securityexception-permission-denial-start-intent
 * http://stackoverflow.com/questions/9154220/remoteviews-setviewvisibility-on-android-widget
 * http://stackoverflow.com/questions/2929393/how-to-update-a-widget-dynamically-not-waiting-30-min-for-onupdate-to-be-called
 * http://stackoverflow.com/questions/3455123/programmatically-update-widget-from-activity-service-receiver
 * http://stackoverflow.com/questions/5161121/find-home-screen-widget-id
 * http://stackoverflow.com/questions/17387191/check-if-a-widget-is-exists-on-homescreen-using-appwidgetid
 * http://stackoverflow.com/questions/23057323/widget-update-via-remoteview-android
 * http://developer.android.com/reference/android/appwidget/AppWidgetManager.html
 * <p/>
 * (BELOW: Sources I've used for previous projects)
 * <p/>
 * For project setup and implementation hints:
 * https://docs.google.com/document/d/1ZlN1fUsCSKuInLECcJkslIqvpKlP7jWL2TP9m6UiA6I/pub?embedded=true (udacity implementation guide)
 * https://www.udacity.com/course/viewer#!/c-nd801/l-4256658707/m-4283743583 (udacity requirements page)
 * Using the sunshine project done in Udacity Lessons for various implementation hints (Lessons 1-3) and the websites stated in Sunshine Project
 * https://jsonformatter.curiousconcept.com/ (for json parsing)
 * <p/>
 * For storing the API Key
 * https://developer.android.com/samples/MediaRouter/res/values/arrays.html for Arrays.xml (I store my api key there and do not add the arrays.xml to git)
 * <p/>
 * For the UI parts
 * http://developer.android.com/guide/topics/ui/layout/gridview.html (For the grid view)
 * <p/>
 * For the data retrieval
 * https://www.themoviedb.org/documentation/api
 * https://www.themoviedb.org/documentation/api/discover
 * https://gist.github.com/baderj/7414775
 * Using the sunshine project done in Udacity Lessons for various implementation hints (Lessons 1-3)
 * from http://developer.android.com/guide/topics/resources/more-resources.html (Api key)
 * http://stackoverflow.com/questions/18280194/using-themoviedb-to-display-image-poster-with-php
 * how to parse JSON to List of Movies taken from sunshine app
 * <p/>
 * Other stuff:
 * Reflection from http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
 * CollectionUtils in android http://stackoverflow.com/questions/30259141/how-to-add-apache-commons-collections-in-android-studio-gradle
 * List conversion http://stackoverflow.com/questions/10975913/how-to-make-a-new-list-with-a-property-of-an-object-which-is-in-another-list
 * Beanutils https://commons.apache.org/proper/commons-beanutils/apidocs/org/apache/commons/beanutils/BeanToPropertyValueTransformer.html and http://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.8.3#gradle
 * Movies Thumbnail taken from http://de.freeimages.com/photo/film-1568846
 * Internet permission: http://developer.android.com/reference/android/Manifest.permission.html and http://stackoverflow.com/questions/2169294/how-to-add-manifest-permission-to-android-application
 * NetworkOnMainThread: http://stackoverflow.com/questions/6343166/android-os-networkonmainthreadexception
 * Image from URL https://forums.xamarin.com/discussion/4323/image-from-url-in-imageview
 * StringUtils http://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.0
 * Hint from Android Studio to exclude 'META-INF/NOTICE.txt' and 'META-INF/LICENSE.txt' in gradle.build File
 * Parcelable intent http://stackoverflow.com/questions/2139134/how-to-send-an-object-from-one-android-activity-to-another-using-intents
 * Parcelling from http://stackoverflow.com/questions/7181526/how-can-i-make-my-custom-objects-be-parcelable and http://techdroid.kbeanie.com/2010/06/parcelable-how-to-do-that-in-android.html
 * Image Adapter from https://github.com/isbjorn/udacity-Popular-Movies-App/blob/master/app/src/main/java/io/maritimus/sofaexpert/ImageAdapter.java
 * Layout Span: http://stackoverflow.com/questions/2710793/what-is-the-equivalent-of-colspan-in-an-android-tablelayout
 * Textview Multiline / Line Breaks: http://stackoverflow.com/questions/6674578/multiline-textview-in-android and http://stackoverflow.com/questions/2197744/android-textview-text-not-getting-wrapped and http://stackoverflow.com/questions/5230290/android-and-displaying-multi-lined-text-in-a-textview-in-a-tablerow
 * <p/>
 * Settings Activity:
 * used from https://gist.github.com/udacityandroid/41aca2eb9ff6942e769b
 * used http://stackoverflow.com/questions/19517417/opening-android-settings-programmatically as reference and http://stackoverflow
 * .com/questions/19248607/settings-preference-activity-is-not-starting and http://viralpatel.net/blogs/android-preferences-activity-example/
 * https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578589/m-1643578590
 * <p/>
 * From The Sunshine-Project some parts were ...
 * =============================================
 * http://developer.android.com/guide/topics/ui/settings.html and https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578576/m-1643578578
 * http://stackoverflow.com/questions/4233873/how-to-get-extra-data-from-intent-in-android
 * share action logic  also taken from from http://developer.android.com/training/sharing/shareaction.html and
 * from Documentation within Android studio and from coding in PlaceholderFragment and from http://developer.android.com/training/sharing/shareaction.html and http://stackoverflow.com/questions/12030631/using-string-inside-shareactionprovider-share-intent
 * and from https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808726/m-1643578595 and http://stackoverflow.com/questions/19358510/why-menuitemcompat-getactionprovider-returns-null
 * taken from http://stackoverflow.com/questions/9739498/android-action-bar-not-showing-overflow
 * using https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578580/m-1643578582
 * taken from http://stackoverflow.com/questions/4233873/how-to-get-extra-data-from-intent-in-android
 * taken from udacity course answer video
 * http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing
 * taken from http://stackoverflow.com/questions/2614719/how-do-i-get-the-sharedpreferences-from-a-preferenceactivity-in-android
 * http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing
 * http://stackoverflow.com/questions/8308695/android-options-menu-in-fragment
 * http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing
 * http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing
 * https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808706/m-1480808709
 * http://developer.android.com/guide/components/intents-filters.html#ExampleExplicit and https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808714/m-1480808717
 * http://stackoverflow.com/questions/3180354/regex-check-if-string-contains-at-least-one-digit
 * http://openweathermap.org/API#forecast
 * usng http://stackoverflow.com/questions/19167954/use-uri-builder-in-android-or-create-url-with-variables and http://developer.android.com/reference/android/net/Uri.Builder.html
 * typed array for appid (from http://developer.android.com/guide/topics/resources/more-resources.html)  //according to http://home.openweathermap.org/ and http://api.openweathermap.org/data/2.5/forecast/daily?q=5760,at&units=metric&mode=json&lang=de&cnt=7 and http://stackoverflow.com/questions/17121213/java-io-ioexception-no-authentication-challenges-found and https://discussions.udacity.com/t/openweathermap-now-requires-an-api-key/34486
 * URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q=" + postalCode + ",at&units=metric&mode=json&lang=de&cnt=7");
 * getting temp taken from http://stackoverflow.com/questions/5566669/how-to-parse-a-json-object-in-android and http://developer.android.com/reference/org/json/JSONObject.html
 * help by https://jsonformatter.curiousconcept.com/
 * using code from https://www.udacity.com/ lessons
 * using initial code from the sunshine repo at github.com
 * using the open weather service as described at http://openweathermap.org/weather-conditions
 * using https://de.wikipedia.org/wiki/ISO-3166-1-Kodierliste for country code
 * using http://openweathermap.org/forecast for the api parameters
 * http://api.openweathermap.org/data/2.5/forecast/daily?q=5760,at&units=metric&mode=json&lang=de&cnt=7
 * Taking https://gist.github.com/udacityandroid/d6a7bb21904046a91695 for HTTP Request "boiler plate code"
 * for ForecastFragment http://stackoverflow.com/questions/20252727/is-not-an-enclosing-class-java
 * http://developer.android.com/reference/android/os/AsyncTask.html for asyncTask
 * using lesson2's codings
 * Menu inflater: http://developer.android.com/guide/topics/ui/menus.html and http://stackoverflow.com/questions/12424063/getmenuinflater-method-undefined-issue-in-android-context-menu-creation and http://stackoverflow.com/questions/18813367/creating-an-options-menu-in-android
 * and http://stackoverflow.com/questions/12395747/option-menu-does-not-appear-in-android and http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing and http://developer.android.com/reference/android/app/Fragment.html
 * and http://stackoverflow.com/questions/8308695/android-options-menu-in-fragment
 * Reacting to click on options item: http://developer.android.com/guide/topics/ui/menus.html
 * For the ifRoom parameter :http://developer.android.com/guide/topics/ui/menus.html
 * For executing an asynchTask: http://www.peachpit.com/articles/article.aspx?p=2166868&seqNum=3
 * Android internet permission: http://stackoverflow.com/questions/2169294/how-to-add-manifest-permission-to-android-application
 * Using code from https://gist.github.com/udacityandroid/4ee49df1694da9129af9
 * OnClick of Listview http://developer.android.com/reference/android/widget/ListView.html
 * Replacing code according to https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/m-4393120181 ( https://github.com/udacity/Sunshine-Version-2/blob/3.02_create_detail_activity/app/src/main/res/layout/activity_detail.xml and https://github.com/udacity/Sunshine-Version-2/blob/3.02_create_detail_activity/app/src/main/java/com/example/android/sunshine/app/DetailActivity.java)
 * using http://developer.android.com/training/basics/firstapp/starting-activity.html and code replacement
 * as described in video lesson 3 (https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/m-1628289061)
 * taken from http://stackoverflow.com/questions/9739498/android-action-bar-not-showing-overflow
 * using https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578580/m-1643578582
 * taken from https://developer.android.com/guide/components/intents-common.html and https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808722/m-1480808725
 * from https://developer.android.com/guide/components/intents-common.html#Maps
 * how to get Package manager from http://stackoverflow.com/questions/17005713/why-would-activity-getpackagemanager-return-null (idea)
 * used from https://gist.github.com/udacityandroid/41aca2eb9ff6942e769b
 * used http://stackoverflow.com/questions/19517417/opening-android-settings-programmatically as reference and http://stackoverflow.com/questions/19248607/settings-preference-activity-is-not-starting and http://viralpatel.net/blogs/android-preferences-activity-example/
 * taking below code from https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578589/m-1643578590
 * from http://developer.android.com/training/sharing/shareaction.html and https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808726/m-1643578595-->
 * as in solution from https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808722/m-1480808725
 * list preference implementation taken from http://stackoverflow.com/questions/9880841/using-list-preference-in-android
 * http://stackoverflow.com/questions/18368748/android-studio-module-wont-show-up-in-edit-configuration (problems after checkout of sunshine)
 * http://stackoverflow.com/questions/25104392/android-studio-no-module (problems after checkout of sunshine)
 * http://stackoverflow.com/questions/19272127/sdk-location-not-found-android-studio-gradle
 * Problems importing project to android studio
 * https://teamtreehouse.com/community/inserting-the-parsecom-files-in-android-studio
 * http://stackoverflow.com/questions/24298896/android-studio-error-8-0-plugin-with-id-android-not-found
 * https://www.google.com/search?q=plugin+with+id+com.parse+not+found&ie=utf-8&oe=utf-8
 * http://stackoverflow.com/questions/19272127/sdk-location-not-found-android-studio-gradle
 * https://www.google.com/search?q=sdk+location+not+found&ie=utf-8&oe=utf-8
 * http://stackoverflow.com/questions/25172006/android-studio-build-fails-with-task-not-found-in-root-project-myproject
 * https://www.google.com/search?q=cannot+get+property+compileSdkVersion&ie=utf-8&oe=utf-8#q=task+compile+debug+source+not+found
 * https://www.google.com/search?q=cannot+get+property+compileSdkVersion&ie=utf-8&oe=utf-8#q=task+compliledebugsources+not+found
 * http://parse-android.s3.amazonaws.com/fb48e439390e00760cb88b07285f79ba/Parse-Starter-Project-1.10.3.zip
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/8
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/7
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/6
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/4
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/3
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858
 * http://stackoverflow.com/questions/31045058/error-cannot-get-property-compilesdkversion-on-extra-properties-extension-as
 * http://android.techjaffa.info/tag/exist-error-cannot-get-property-compilesdkversion-on-extra-properties-extension-as-it-does-not/
 * https://github.com/ParsePlatform/ParseUI-Android/issues/8
 * http://stackoverflow.com/questions/28319365/error-package-android-support-v7-app-does-not-exist-android-studio
 * http://stackoverflow.com/questions/18299898/the-import-android-support-cannot-be-resolved
 * Parts from the sunshine project in all lessons up until now and parts from the github repo
 * http://developer.android.com/reference/android/content/UriMatcher.html
 * http://developer.android.com/guide/components/loaders.html
 * http://developer.android.com/reference/android/content/CursorLoader.html
 * http://developer.android.com/reference/android/provider/MediaStore.Audio.Media.html
 * http://stackoverflow.com/questions/26983905/android-programming-making-a-uri-to-get-audio-location
 * https://developer.android.com/design/material/index.html
 * http://www.google.com/design/spec/material-design/introduction.html#introduction-goals
 * http://developer.android.com/guide/topics/ui/layout/linear.html#Weight
 * https://gist.github.com/udacityandroid/a86d966f3f4105a22ac3#file-strings-xml
 * http://developer.android.com/guide/components/fragments.html
 * http://developer.android.com/reference/android/app/FragmentManager.html/
 * http://developer.android.com/reference/android/app/FragmentTransaction.html
 * https://github.com/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/app/src/main/res/layout-sw600dp/activity_main.xml
 * https://github.com/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/app/src/main/res/layout/activity_main.xml
 * https://github.com/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/app/src/main/res/layout/activity_detail.xml
 * https://github.com/udacity/Sunshine-Version-2/compare/5.08_images...5.09_two_pane_ui
 * https://gist.github.com/udacityandroid/41f9e52a36e88388624d
 * http://developer.android.com/reference/android/app/Fragment.html
 * http://developer.android.com/reference/android/widget/AbsListView.html#setChoiceMode%28int%29
 * https://gist.github.com/udacityandroid/0c906a3bdb9f518bab8f
 * http://developer.android.com/guide/topics/ui/themes.html
 * http://developer.android.com/training/multiscreen/screensizes.html#TaskUseAliasFilters
 * https://github.com/udacity/Sunshine-Version-2/compare/5.14_today_item_tablet...5.15_action_bar
 * https://gist.github.com/udacityandroid/1c799806f0e519015125
 * https://github.com/udacity/Sunshine-Version-2/tree/5.17_redlines_list_item/app/src/main/res/layout
 * https://github.com/udacity/Sunshine-Version-2/compare/5.16_settings_action_bar...5.17_redlines_list_item
 * http://stackoverflow.com/questions/11692162/android-change-background-color-of-fragment
 * http://stackoverflow.com/questions/5350624/set-icon-for-android-application
 * https://github.com/udacity/Sunshine-Version-2/compare/5.17_redlines_list_item...5.18_redlines_finish
 * http://stackoverflow.com/questions/23330816/error-package-android-support-v7-app-does-not-exist
 * https://blog.xamarin.com/android-tips-hello-appcompatactivity-goodbye-actionbaractivity/
 * http://developer.android.com/tools/support-library/features.html#v7-appcompat
 * http://developer.android.com/tools/support-library/index.html
 * http://developer.android.com/tools/revisions/build-tools.html
 * http://stackoverflow.com/questions/17954596/how-to-draw-circle-by-canvas-in-android
 * https://gist.github.com/qihnus/1909616
 * For Javadoc Comments http://stackoverflow.com/questions/17291785/how-to-generate-javadoc-comments-in-android-studio
 * http://stackoverflow.com/questions/29138760/retrofit-android-gson-array-content-deserialization
 * http://square.github.io/retrofit/
 * http://stackoverflow.com/questions/24745236/restrofit-deserializing-json-response
 * http://stackoverflow.com/questions/32269064/unable-to-create-call-adapter-for-class-example-simple
 * http://stackoverflow.com/questions/29323095/retrofit-call-inside-asynctask
 * http://stackoverflow.com/questions/33077292/abstractmethoderror-when-using-rxjavacalladapterfactory-on-retrofit-2
 * http://stackoverflow.com/questions/32367469/unable-to-create-converter-for-my-class-in-android-retrofit-library
 * http://stackoverflow.com/questions/24154917/retrofit-expected-begin-object-but-was-begin-array
 * http://stackoverflow.com/questions/25089339/retrofit-returns-an-empty-array
 * https://www.reddit.com/r/androiddev/comments/2cdgc8/retrofit_returns_an_empty_array/
 * http://stackoverflow.com/questions/12348627/bad-parcelable-exception
 * http://stackoverflow.com/questions/7037630/how-to-create-a-video-preview-in-android
 * http://stackoverflow.com/questions/9739498/android-action-bar-not-showing-overflow
 * http://stackoverflow.com/questions/6300608/how-to-pass-a-parcelable-object-that-contains-a-list-of-objects
 * http://stackoverflow.com/questions/7037630/how-to-create-a-video-preview-in-android
 * http://stackoverflow.com/questions/574195/android-youtube-app-play-video-intent
 * http://developer.android.com/guide/components/intents-filters.html
 * http://stackoverflow.com/questions/2139134/how-to-send-an-object-from-one-android-activity-to-another-using-intents
 * http://stackoverflow.com/questions/16333754/how-to-customize-listview-using-baseadapter
 * http://stackoverflow.com/questions/2139134/how-to-send-an-object-from-one-android-activity-to-another-using-intents
 * http://stackoverflow.com/questions/5796611/dialog-throwing-unable-to-add-window-token-null-is-not-for-an-application-wi
 * http://stackoverflow.com/questions/1996294/problem-unmarshalling-parcelables
 * http://stackoverflow.com/questions/10552062/badparcelableexception-classnotfoundexception-when-unmarshalling-empty-classn
 * http://stackoverflow.com/questions/4540754/dynamically-add-elements-to-a-listview-android
 * http://stackoverflow.com/questions/1851633/how-to-add-a-button-dynamically-in-android
 * http://stackoverflow.com/questions/8438778/how-to-load-youtube-video-thumbnails-in-android
 * http://stackoverflow.com/questions/26572048/elevation-on-android-lollipop-not-working
 * http://stackoverflow.com/questions/11411421/separation-between-rows-in-table-layout
 * http://stackoverflow.com/questions/14020859/change-height-of-a-listview-dynamicallyandroid
 * http://stackoverflow.com/questions/6343166/android-os-networkonmainthreadexception
 * http://stackoverflow.com/questions/9458258/return-value-from-async-task-in-android
 * http://stackoverflow.com/questions/12580742/dynamically-filling-a-table-layout-with-table-rows
 * http://stackoverflow.com/questions/5255184/android-and-setting-width-and-height-programmatically-in-dp-units
 * http://stackoverflow.com/questions/14354279/call-parents-activity-from-a-fragment
 * http://stackoverflow.com/questions/18013912/selectionargs-in-sqlitequerybuilder-doesnt-work-with-integer-values-in-columns
 * http://stackoverflow.com/questions/7374785/getstring-from-strings-xml-in-appwidgetprovider
 * http://developer.android.com/guide/topics/ui/controls/togglebutton.html
 * http://stackoverflow.com/questions/1741334/sqliteopenhelper-getwriteabledatabase-null-pointer-exception-on-android
 * http://stackoverflow.com/questions/16128636/sqliteopenhelper-null-pointer-exception
 * http://stackoverflow.com/questions/7930139/android-database-locked
 * http://developer.android.com/reference/android/database/sqlite/SQLiteDatabaseLockedException.html
 * http://developer.android.com/reference/android/database/AbstractCursor.html#moveToFirst%28%29
 * http://stackoverflow.com/questions/20777533/sqlite-cannot-bind-argument-at-index-1-because-the-index-is-out-of-range-the-s
 * https://developer.android.com/training/scheduling/alarms.html#set
 * http://developer.android.com/guide/components/services.html
 * https://github.com/udacity/Sunshine-Version-2/tree/lesson_6_sync_adapter_starter_code
 * http://developer.android.com/reference/android/app/NotificationManager.html
 * http://developer.android.com/reference/android/support/v4/app/NotificationCompat.Builder.html
 * http://developer.android.com/reference/android/support/v4/app/TaskStackBuilder.html
 * http://developer.android.com/guide/topics/ui/notifiers/notifications.html
 * http://developer.android.com/reference/android/app/PendingIntent.html
 */


/**
 * From The Sunshine-Project some parts were ...
 * =============================================
 * http://developer.android.com/guide/topics/ui/settings.html and https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578576/m-1643578578
 * http://stackoverflow.com/questions/4233873/how-to-get-extra-data-from-intent-in-android
 * share action logic  also taken from from http://developer.android.com/training/sharing/shareaction.html and
 * from Documentation within Android studio and from coding in PlaceholderFragment and from http://developer.android.com/training/sharing/shareaction.html and http://stackoverflow.com/questions/12030631/using-string-inside-shareactionprovider-share-intent
 * and from https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808726/m-1643578595 and http://stackoverflow.com/questions/19358510/why-menuitemcompat-getactionprovider-returns-null
 * taken from http://stackoverflow.com/questions/9739498/android-action-bar-not-showing-overflow
 * using https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578580/m-1643578582
 * taken from http://stackoverflow.com/questions/4233873/how-to-get-extra-data-from-intent-in-android
 * taken from udacity course answer video
 * http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing
 * taken from http://stackoverflow.com/questions/2614719/how-do-i-get-the-sharedpreferences-from-a-preferenceactivity-in-android
 * http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing
 * http://stackoverflow.com/questions/8308695/android-options-menu-in-fragment
 * http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing
 * http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing
 * https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808706/m-1480808709
 * http://developer.android.com/guide/components/intents-filters.html#ExampleExplicit and https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808714/m-1480808717
 * http://stackoverflow.com/questions/3180354/regex-check-if-string-contains-at-least-one-digit
 * http://openweathermap.org/API#forecast
 * usng http://stackoverflow.com/questions/19167954/use-uri-builder-in-android-or-create-url-with-variables and http://developer.android.com/reference/android/net/Uri.Builder.html
 * typed array for appid (from http://developer.android.com/guide/topics/resources/more-resources.html)  //according to http://home.openweathermap.org/ and http://api.openweathermap.org/data/2.5/forecast/daily?q=5760,at&units=metric&mode=json&lang=de&cnt=7 and http://stackoverflow.com/questions/17121213/java-io-ioexception-no-authentication-challenges-found and https://discussions.udacity.com/t/openweathermap-now-requires-an-api-key/34486
 * URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q=" + postalCode + ",at&units=metric&mode=json&lang=de&cnt=7");
 * getting temp taken from http://stackoverflow.com/questions/5566669/how-to-parse-a-json-object-in-android and http://developer.android.com/reference/org/json/JSONObject.html
 * help by https://jsonformatter.curiousconcept.com/
 * using code from https://www.udacity.com/ lessons
 * using initial code from the sunshine repo at github.com
 * using the open weather service as described at http://openweathermap.org/weather-conditions
 * using https://de.wikipedia.org/wiki/ISO-3166-1-Kodierliste for country code
 * using http://openweathermap.org/forecast for the api parameters
 * http://api.openweathermap.org/data/2.5/forecast/daily?q=5760,at&units=metric&mode=json&lang=de&cnt=7
 * Taking https://gist.github.com/udacityandroid/d6a7bb21904046a91695 for HTTP Request "boiler plate code"
 * for ForecastFragment http://stackoverflow.com/questions/20252727/is-not-an-enclosing-class-java
 * http://developer.android.com/reference/android/os/AsyncTask.html for asyncTask
 * using lesson2's codings
 * Menu inflater: http://developer.android.com/guide/topics/ui/menus.html and http://stackoverflow.com/questions/12424063/getmenuinflater-method-undefined-issue-in-android-context-menu-creation and http://stackoverflow.com/questions/18813367/creating-an-options-menu-in-android
 * and http://stackoverflow.com/questions/12395747/option-menu-does-not-appear-in-android and http://stackoverflow.com/questions/12090335/menu-in-fragments-not-showing and http://developer.android.com/reference/android/app/Fragment.html
 * and http://stackoverflow.com/questions/8308695/android-options-menu-in-fragment
 * Reacting to click on options item: http://developer.android.com/guide/topics/ui/menus.html
 * For the ifRoom parameter :http://developer.android.com/guide/topics/ui/menus.html
 * For executing an asynchTask: http://www.peachpit.com/articles/article.aspx?p=2166868&seqNum=3
 * Android internet permission: http://stackoverflow.com/questions/2169294/how-to-add-manifest-permission-to-android-application
 * Using code from https://gist.github.com/udacityandroid/4ee49df1694da9129af9
 * OnClick of Listview http://developer.android.com/reference/android/widget/ListView.html
 * Replacing code according to https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/m-4393120181 ( https://github.com/udacity/Sunshine-Version-2/blob/3.02_create_detail_activity/app/src/main/res/layout/activity_detail.xml and https://github.com/udacity/Sunshine-Version-2/blob/3.02_create_detail_activity/app/src/main/java/com/example/android/sunshine/app/DetailActivity.java)
 * using http://developer.android.com/training/basics/firstapp/starting-activity.html and code replacement
 * as described in video lesson 3 (https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/m-1628289061)
 * taken from http://stackoverflow.com/questions/9739498/android-action-bar-not-showing-overflow
 * using https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578580/m-1643578582
 * taken from https://developer.android.com/guide/components/intents-common.html and https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808722/m-1480808725
 * from https://developer.android.com/guide/components/intents-common.html#Maps
 * how to get Package manager from http://stackoverflow.com/questions/17005713/why-would-activity-getpackagemanager-return-null (idea)
 * used from https://gist.github.com/udacityandroid/41aca2eb9ff6942e769b
 * used http://stackoverflow.com/questions/19517417/opening-android-settings-programmatically as reference and http://stackoverflow.com/questions/19248607/settings-preference-activity-is-not-starting and http://viralpatel.net/blogs/android-preferences-activity-example/
 * taking below code from https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1643578589/m-1643578590
 * from http://developer.android.com/training/sharing/shareaction.html and https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808726/m-1643578595-->
 * as in solution from https://www.udacity.com/course/viewer#!/c-ud853-nd/l-1474559101/e-1480808722/m-1480808725
 * list preference implementation taken from http://stackoverflow.com/questions/9880841/using-list-preference-in-android
 * http://stackoverflow.com/questions/18368748/android-studio-module-wont-show-up-in-edit-configuration (problems after checkout of sunshine)
 * http://stackoverflow.com/questions/25104392/android-studio-no-module (problems after checkout of sunshine)
 * http://stackoverflow.com/questions/19272127/sdk-location-not-found-android-studio-gradle
 Problems importing project to android studio
 * https://teamtreehouse.com/community/inserting-the-parsecom-files-in-android-studio
 * http://stackoverflow.com/questions/24298896/android-studio-error-8-0-plugin-with-id-android-not-found
 * https://www.google.com/search?q=plugin+with+id+com.parse+not+found&ie=utf-8&oe=utf-8
 * http://stackoverflow.com/questions/19272127/sdk-location-not-found-android-studio-gradle
 * https://www.google.com/search?q=sdk+location+not+found&ie=utf-8&oe=utf-8
 * http://stackoverflow.com/questions/25172006/android-studio-build-fails-with-task-not-found-in-root-project-myproject
 * https://www.google.com/search?q=cannot+get+property+compileSdkVersion&ie=utf-8&oe=utf-8#q=task+compile+debug+source+not+found
 * https://www.google.com/search?q=cannot+get+property+compileSdkVersion&ie=utf-8&oe=utf-8#q=task+compliledebugsources+not+found
 * http://parse-android.s3.amazonaws.com/fb48e439390e00760cb88b07285f79ba/Parse-Starter-Project-1.10.3.zip
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/8
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/7
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/6
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/4
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858/3
 * https://discuss.gradle.org/t/getting-android-compilesdkversion-is-missing-error-gradle-build/9858
 * http://stackoverflow.com/questions/31045058/error-cannot-get-property-compilesdkversion-on-extra-properties-extension-as
 * http://android.techjaffa.info/tag/exist-error-cannot-get-property-compilesdkversion-on-extra-properties-extension-as-it-does-not/
 * https://github.com/ParsePlatform/ParseUI-Android/issues/8
 * http://stackoverflow.com/questions/28319365/error-package-android-support-v7-app-does-not-exist-android-studio
 * http://stackoverflow.com/questions/18299898/the-import-android-support-cannot-be-resolved
 * Parts from the sunshine project in all lessons up until now and parts from the github repo
 * http://developer.android.com/reference/android/content/UriMatcher.html
 * http://developer.android.com/guide/components/loaders.html
 * http://developer.android.com/reference/android/content/CursorLoader.html
 * http://developer.android.com/reference/android/provider/MediaStore.Audio.Media.html
 * http://stackoverflow.com/questions/26983905/android-programming-making-a-uri-to-get-audio-location
 * https://developer.android.com/design/material/index.html
 * http://www.google.com/design/spec/material-design/introduction.html#introduction-goals
 * http://developer.android.com/guide/topics/ui/layout/linear.html#Weight
 * https://gist.github.com/udacityandroid/a86d966f3f4105a22ac3#file-strings-xml
 * http://developer.android.com/guide/components/fragments.html
 * http://developer.android.com/reference/android/app/FragmentManager.html/
 * http://developer.android.com/reference/android/app/FragmentTransaction.html
 * https://github.com/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/app/src/main/res/layout-sw600dp/activity_main.xml
 * https://github.com/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/app/src/main/res/layout/activity_main.xml
 * https://github.com/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/app/src/main/res/layout/activity_detail.xml
 * https://github.com/udacity/Sunshine-Version-2/compare/5.08_images...5.09_two_pane_ui
 * https://gist.github.com/udacityandroid/41f9e52a36e88388624d
 * http://developer.android.com/reference/android/app/Fragment.html
 * http://developer.android.com/reference/android/widget/AbsListView.html#setChoiceMode%28int%29
 * https://gist.github.com/udacityandroid/0c906a3bdb9f518bab8f
 * http://developer.android.com/guide/topics/ui/themes.html
 * http://developer.android.com/training/multiscreen/screensizes.html#TaskUseAliasFilters
 * https://github.com/udacity/Sunshine-Version-2/compare/5.14_today_item_tablet...5.15_action_bar
 * https://gist.github.com/udacityandroid/1c799806f0e519015125
 * https://github.com/udacity/Sunshine-Version-2/tree/5.17_redlines_list_item/app/src/main/res/layout
 * https://github.com/udacity/Sunshine-Version-2/compare/5.16_settings_action_bar...5.17_redlines_list_item
 * http://stackoverflow.com/questions/11692162/android-change-background-color-of-fragment
 * http://stackoverflow.com/questions/5350624/set-icon-for-android-application
 * https://github.com/udacity/Sunshine-Version-2/compare/5.17_redlines_list_item...5.18_redlines_finish
 * http://stackoverflow.com/questions/23330816/error-package-android-support-v7-app-does-not-exist
 * https://blog.xamarin.com/android-tips-hello-appcompatactivity-goodbye-actionbaractivity/
 * http://developer.android.com/tools/support-library/features.html#v7-appcompat
 * http://developer.android.com/tools/support-library/index.html
 * http://developer.android.com/tools/revisions/build-tools.html
 * http://stackoverflow.com/questions/17954596/how-to-draw-circle-by-canvas-in-android
 * https://gist.github.com/qihnus/1909616
 * For Javadoc Comments http://stackoverflow.com/questions/17291785/how-to-generate-javadoc-comments-in-android-studio
 * http://stackoverflow.com/questions/29138760/retrofit-android-gson-array-content-deserialization
 * http://square.github.io/retrofit/
 * http://stackoverflow.com/questions/24745236/restrofit-deserializing-json-response
 * http://stackoverflow.com/questions/32269064/unable-to-create-call-adapter-for-class-example-simple
 * http://stackoverflow.com/questions/29323095/retrofit-call-inside-asynctask
 * http://stackoverflow.com/questions/33077292/abstractmethoderror-when-using-rxjavacalladapterfactory-on-retrofit-2
 * http://stackoverflow.com/questions/32367469/unable-to-create-converter-for-my-class-in-android-retrofit-library
 * http://stackoverflow.com/questions/24154917/retrofit-expected-begin-object-but-was-begin-array
 * http://stackoverflow.com/questions/25089339/retrofit-returns-an-empty-array
 * https://www.reddit.com/r/androiddev/comments/2cdgc8/retrofit_returns_an_empty_array/
 * http://stackoverflow.com/questions/12348627/bad-parcelable-exception
 * http://stackoverflow.com/questions/7037630/how-to-create-a-video-preview-in-android
 * http://stackoverflow.com/questions/9739498/android-action-bar-not-showing-overflow
 * http://stackoverflow.com/questions/6300608/how-to-pass-a-parcelable-object-that-contains-a-list-of-objects
 * http://stackoverflow.com/questions/7037630/how-to-create-a-video-preview-in-android
 * http://stackoverflow.com/questions/574195/android-youtube-app-play-video-intent
 * http://developer.android.com/guide/components/intents-filters.html
 * http://stackoverflow.com/questions/2139134/how-to-send-an-object-from-one-android-activity-to-another-using-intents
 * http://stackoverflow.com/questions/16333754/how-to-customize-listview-using-baseadapter
 * http://stackoverflow.com/questions/2139134/how-to-send-an-object-from-one-android-activity-to-another-using-intents
 * http://stackoverflow.com/questions/5796611/dialog-throwing-unable-to-add-window-token-null-is-not-for-an-application-wi
 * http://stackoverflow.com/questions/1996294/problem-unmarshalling-parcelables
 * http://stackoverflow.com/questions/10552062/badparcelableexception-classnotfoundexception-when-unmarshalling-empty-classn
 * http://stackoverflow.com/questions/4540754/dynamically-add-elements-to-a-listview-android
 * http://stackoverflow.com/questions/1851633/how-to-add-a-button-dynamically-in-android
 * http://stackoverflow.com/questions/8438778/how-to-load-youtube-video-thumbnails-in-android
 * http://stackoverflow.com/questions/26572048/elevation-on-android-lollipop-not-working
 * http://stackoverflow.com/questions/11411421/separation-between-rows-in-table-layout
 * http://stackoverflow.com/questions/14020859/change-height-of-a-listview-dynamicallyandroid
 * http://stackoverflow.com/questions/6343166/android-os-networkonmainthreadexception
 * http://stackoverflow.com/questions/9458258/return-value-from-async-task-in-android
 * http://stackoverflow.com/questions/12580742/dynamically-filling-a-table-layout-with-table-rows
 * http://stackoverflow.com/questions/5255184/android-and-setting-width-and-height-programmatically-in-dp-units
 * http://stackoverflow.com/questions/14354279/call-parents-activity-from-a-fragment
 * http://stackoverflow.com/questions/18013912/selectionargs-in-sqlitequerybuilder-doesnt-work-with-integer-values-in-columns
 * http://stackoverflow.com/questions/7374785/getstring-from-strings-xml-in-appwidgetprovider
 * http://developer.android.com/guide/topics/ui/controls/togglebutton.html
 * http://stackoverflow.com/questions/1741334/sqliteopenhelper-getwriteabledatabase-null-pointer-exception-on-android
 * http://stackoverflow.com/questions/16128636/sqliteopenhelper-null-pointer-exception
 * http://stackoverflow.com/questions/7930139/android-database-locked
 * http://developer.android.com/reference/android/database/sqlite/SQLiteDatabaseLockedException.html
 * http://developer.android.com/reference/android/database/AbstractCursor.html#moveToFirst%28%29
 * http://stackoverflow.com/questions/20777533/sqlite-cannot-bind-argument-at-index-1-because-the-index-is-out-of-range-the-s
 https://developer.android.com/training/scheduling/alarms.html#set
 http://developer.android.com/guide/components/services.html
 https://github.com/udacity/Sunshine-Version-2/tree/lesson_6_sync_adapter_starter_code
 http://developer.android.com/reference/android/app/NotificationManager.html
 http://developer.android.com/reference/android/support/v4/app/NotificationCompat.Builder.html
 http://developer.android.com/reference/android/support/v4/app/TaskStackBuilder.html
 http://developer.android.com/guide/topics/ui/notifiers/notifications.html
 http://developer.android.com/reference/android/app/PendingIntent.html
 */

package com.example.android.sunshine.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.sunshine.app.data.WeatherContract;
import com.example.android.sunshine.app.gcm.RegistrationIntentService;
import com.example.android.sunshine.app.sync.SunshineSyncAdapter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity implements ForecastFragment.Callback {

    public static final String SENT_TOKEN_TO_SERVER = "sentTokenToServer";
    private static final String DETAILFRAGMENT_TAG = "DFTAG";
    private final static int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final String LOG_TAG = MainActivity.class.getSimpleName();
    private boolean mTwoPane;
    private String mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLocation = Utility.getPreferredLocation(this);
        Uri contentUri = getIntent() != null ? getIntent().getData() : null;

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        if (findViewById(R.id.weather_detail_container) != null) {
            // The detail container view will be present only in the large-screen layouts
            // (res/layout-sw600dp). If this view is present, then the activity should be
            // in two-pane mode.
            mTwoPane = true;
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            if (savedInstanceState == null) {
                DetailFragment fragment = new DetailFragment();
                if (contentUri != null) {
                    Bundle args = new Bundle();
                    args.putParcelable(DetailFragment.DETAIL_URI, contentUri);
                    fragment.setArguments(args);
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.weather_detail_container, fragment, DETAILFRAGMENT_TAG)
                        .commit();
            }
        } else {
            mTwoPane = false;
            getSupportActionBar().setElevation(0f);
        }

        ForecastFragment forecastFragment =  ((ForecastFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment_forecast));
        forecastFragment.setUseTodayLayout(!mTwoPane);
        if (contentUri != null) {
            forecastFragment.setInitialSelectedDate(
                    WeatherContract.WeatherEntry.getDateFromUri(contentUri));
        }

        SunshineSyncAdapter.initializeSyncAdapter(this);

        // If Google Play Services is up to date, we'll want to register GCM. If it is not, we'll
        // skip the registration and this device will not receive any downstream messages from
        // our fake server. Because weather alerts are not a core feature of the app, this should
        // not affect the behavior of the app, from a user perspective.
        if (checkPlayServices()) {
            // Because this is the initial creation of the app, we'll want to be certain we have
            // a token. If we do not, then we will start the IntentService that will register this
            // application with GCM.
            SharedPreferences sharedPreferences =
                    PreferenceManager.getDefaultSharedPreferences(this);
            boolean sentToken = sharedPreferences.getBoolean(SENT_TOKEN_TO_SERVER, false);
            if (!sentToken) {
                Intent intent = new Intent(this, RegistrationIntentService.class);
                startService(intent);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String location = Utility.getPreferredLocation( this );
        // update the location in our second pane using the fragment manager
            if (location != null && !location.equals(mLocation)) {
            ForecastFragment ff = (ForecastFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_forecast);
            if ( null != ff ) {
                ff.onLocationChanged();
            }
            DetailFragment df = (DetailFragment)getSupportFragmentManager().findFragmentByTag(DETAILFRAGMENT_TAG);
            if ( null != df ) {
                df.onLocationChanged(location);
            }
            mLocation = location;
        }
    }

    @Override
    public void onItemSelected(Uri contentUri, ForecastAdapter.ForecastAdapterViewHolder vh) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle args = new Bundle();
            args.putParcelable(DetailFragment.DETAIL_URI, contentUri);

            DetailFragment fragment = new DetailFragment();
            fragment.setArguments(args);

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.weather_detail_container, fragment, DETAILFRAGMENT_TAG)
                    .commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class)
                    .setData(contentUri);

            ActivityOptionsCompat activityOptions =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                            new Pair<View, String>(vh.mIconView, getString(R.string.detail_icon_transition_name)));
            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        }
    }

    /**
     * Check the device to make sure it has the Google Play Services APK. If
     * it doesn't, display a dialog that allows users to download the APK from
     * the Google Play Store or enable it in the device's system settings.
     */
    private boolean checkPlayServices() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (apiAvailability.isUserResolvableError(resultCode)) {
                apiAvailability.getErrorDialog(this, resultCode,
                        PLAY_SERVICES_RESOLUTION_REQUEST).show();
            } else {
                Log.i(LOG_TAG, "This device is not supported.");
                finish();
            }
            return false;
        }
        return true;
    }
}
