# angular-seed-clj

Yet another clojure/angular template. This one is based on
[angular-seed][] and [foundation][].

[angular-seed]: https://github.com/angular/angular-seed
[foundation]: http://foundation.zurb.com/

## Prerequisites

The following dependencies must be installed before running.

+[leiningen][]
+[npm][]
+[bower][]


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
