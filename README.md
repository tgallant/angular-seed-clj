# angular-seed-clj

Yet another clojure/angular template. This one is based on
[angular-seed][] and [foundation][].

[angular-seed]: https://github.com/angular/angular-seed
[foundation]: http://foundation.zurb.com/

## Prerequisites

The following dependencies must be installed before running.

+ [leiningen][]
+ [npm][]
+ [bower][]


[leiningen]: https://github.com/technomancy/leiningen
[npm]: https://www.npmjs.com/
[bower]: http://bower.io/

## Running

To start a new angular-seed-clj project, run:

    git clone --depth=1 https://github.com/tgallant/angular-seed-clj.git <project name>

This will grab the newest version from github and clone it into the
<project name> directory.

To download all of the projects dependencies, run the following:

    lein deps
    cd resources && npm install

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2015 Tim Gallant

All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
