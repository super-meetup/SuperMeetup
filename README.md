# Group Project - *SuperMeetup*

**SuperMeetup** is an android app that allows a user to search meetups in the world, to see new meetups on time, to get recommended meetups and decide which meetup to attend. The app utilizes [Meetup REST API](https://www.meetup.com/meetup_api/).

Time spent: **X** hours spent in total

## User Stories

Incorporates 4 mobile-oriented features: maps, location, sensors, and real-time.

The following **required** functionality is completed:

* [ ] User can switch Nearby, Search, New and Shake UI using tabs.
* [ ] Nearby: Show nearby meetups
* [ ] Search: User can search meetups. Show search result in a list by default and can be switch to mapview
* [ ] New: User can see real-time new meetups in mapview. Get real-time new meetups via Meetup Stream API
* [ ] Shake: User can shake phone to get a recommended meetup.
* [ ] Click any meetup item, user can see the meetup detail UI.
* [ ] Click any group item, user can see the meetup group UI.
* [ ] User can [infinitely paginate](http://guides.codepath.com/android/Endless-Scrolling-with-AdapterViews-and-RecyclerView) any listview.

The following **optional** features are implemented:

* [ ] List participant's profile image in each meetup
* [ ] Can see user's profile

The following **bonus** features are implemented:

* [ ] Can RSVP a meetup


## Wireframing

Here's a walkthrough of implemented user stories:
[Video](https://github.com/super-meetup/SuperMeetup/blob/master/media/0.supermeetup_design.mp4)

Here's the wireframing file: [Fluid UI](https://www.fluidui.com/editor/live/preview/cF9Ha29HS0NpRExLYkI5VG9wVGhLdW9Ka3VaZmtYVGJweQ==)

<img src='https://github.com/super-meetup/SuperMeetup/blob/master/media/0.supermeetup_design.gif' title='GIF Walkthrough SuperMeetup Design ' width='' alt='GIF Walkthrough SuperMeetup Design' />


GIF created with [EZGIF.com](https://ezgif.com/video-to-gif).

## Open-source libraries used

- [CodePath OAuth Handler](https://github.com/codepath/android-oauth-handler) - Android OAuth Wrapper makes authenticating with APIs simple
- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - An image loading and caching library for Android focused on smooth scrolling
- [Parceler library](http://guides.codepath.com/android/Using-Parceler)

## License

Copyright 2017 [SuperMeetup](https://github.com/super-meetup)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.