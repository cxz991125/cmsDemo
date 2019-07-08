const webpack = require('webpack');
const path = require('path');
const VueLoaderPlugin = require('vue-loader/lib/plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const {CleanWebpackPlugin} = require('clean-webpack-plugin');
const ExtractTextPlugin = require('extract-text-webpack-plugin');

function resolve (dir) {
    return path.join(__dirname, '..', dir)
}

module.exports = {

    mode:'development',

    entry:{
        app:'./src/main.js'
    },

    devtool: 'inline-source-map',

    output:{
        path:path.resolve(__dirname,'../','dist'),
        filename:'[name].js',
        publicPath:'/'
    },

    resolve: {
        modules: ['node_modules'],
        extensions: ['.js', '.vue','.scss'],
        alias:{
            '@':resolve('src')
        }
    },

    module:{
        rules:[
            {
                test:/\.vue$/,
                use:[
                    'vue-loader'
                ]
            },
            {
                test:/\.css$/,
                use:[
                    'style-loader',
                    'css-loader',
                    'postcss-loader'
                ]
            },
            {
                test:/\.styl/,
                use:[
                    "style-loader",
                    "css-loader",
                    'postcss-loader',
                    "stylus-loader"
                ]
            },
            {
                test: /\.(eot|svg|ttf|woff|woff2)(\?\S*)?$/,
                loader: 'file-loader'
              },
              {
                test: /\.(png|jpe?g|gif|svg)(\?\S*)?$/,
                loader: 'file-loader',
                query: {
                  name: '[name].[ext]?[hash]'
                }
              }
        ]
    },

    plugins:[
        new CleanWebpackPlugin(),
        new HtmlWebpackPlugin({
            filename: 'index.html', 
            template: 'src/assets/template/index.html',
            inject: true
       }),
       new webpack.NamedModulesPlugin(),
       new webpack.HotModuleReplacementPlugin(),
       new VueLoaderPlugin()
    ]
}