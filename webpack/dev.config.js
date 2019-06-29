const webpack = require('webpack');
const path = require('path');
const VueLoaderPlugin = require('vue-loader/lib/plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const {CleanWebpackPlugin} = require('clean-webpack-plugin');

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
                    'css-loader'
                ]
            }
        ]
    },

    devServer:{
        contentBase:'../dist',
        compress: true,
        port: 8080,
        clientLogLevel:'none',
        hot:true
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