const webpackDevServer = require('webpack-dev-server');
const webpack = require('webpack');
const path = require('path');

const config = require('./dev.config');
const options = {
    contentBase:'../dist',
    hot:true,
    host:'localHost',
    clientLogLevel:'none'
};

webpackDevServer.addDevServerEntrypoints(config,options);
const compiler = webpack(config);
const server = new webpackDevServer(compiler,options);

server.listen('8080')