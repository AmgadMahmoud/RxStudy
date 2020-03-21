package com.example.rxstudy;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // this is cold observable
//        Observable<Long> cold = Observable.intervalRange(0, 5, 0, 1, TimeUnit.SECONDS);


        /** this is ConnectableObservable which covert from cold to hot observable */
//        ConnectableObservable<Long> cold = ConnectableObservable.intervalRange(0, 5, 0, 1, TimeUnit.SECONDS).publish();
//        cold.connect(); // to convert cold observable to hot observable first way to get hot observable
//        cold.subscribe(i -> Log.d(TAG, "onCreate: student 1:" + i));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        cold.subscribe(i -> Log.d(TAG, "onCreate: student 2:" + i));


        /** this is publish subject which is not interested in listen previous he listen which explain when it come
         in this example out put will be
         FirstA
         FirstB
         FirstC
         FirstD
         FirstE
         SecondE
         FirstF
         SecondF
         FirstG
         SecondG */

//        PublishSubject<String> subject = PublishSubject.create();

//        subject.subscribe(i -> Log.d(TAG, "onCreate: First" + i));
//        subject.onNext("A");
//        sleep(1000);
//        subject.onNext("B");
//        sleep(1000);
//        subject.onNext("C");
//        sleep(1000);
//        subject.onNext("D");
//        sleep(1000);
//
//        subject.subscribe(i -> Log.d(TAG, "onCreate: Second" + i));
//
//        subject.onNext("E");
//        sleep(1000);
//        subject.onNext("F");
//        sleep(1000);
//        subject.onNext("G");
//        sleep(1000);


        /** this is Behavior Subject which is interested in listen the last thing explained to know what will be next
         in this example out put will be
         FirstA
         FirstB
         FirstC
         FirstD
         SecondD
         FirstE
         SecondE
         FirstF
         SecondF
         FirstG
         SecondG     */

//        BehaviorSubject<String> subject = BehaviorSubject.create();
//
//        subject.subscribe(i -> Log.d(TAG, "onCreate: First" + i));
//        subject.onNext("A");
//        sleep(1000);
//        subject.onNext("B");
//        sleep(1000);
//        subject.onNext("C");
//        sleep(1000);
//        subject.onNext("D");
//        sleep(1000);
//
//        subject.subscribe(i -> Log.d(TAG, "onCreate: Second" + i));
//
//        subject.onNext("E");
//        sleep(1000);
//        subject.onNext("F");
//        sleep(1000);
//        subject.onNext("G");
//        sleep(1000);

        /** this is replay Subject which is interested in listen all things explained before
         in this example out put will be
         FirstA
         FirstB
         FirstC
         FirstD
         SecondA
         SecondB
         SecondC
         SecondD
         FirstE
         SecondE
         FirstF
         SecondF
         FirstG
         SecondG
         */

//        ReplaySubject<String> subject = ReplaySubject.create();
//
//        subject.subscribe(i -> Log.d(TAG, "onCreate: First" + i));
//        subject.onNext("A");
//        sleep(1000);
//        subject.onNext("B");
//        sleep(1000);
//        subject.onNext("C");
//        sleep(1000);
//        subject.onNext("D");
//        sleep(1000);
//
//        subject.subscribe(i -> Log.d(TAG, "onCreate: Second" + i));
//
//        subject.onNext("E");
//        sleep(1000);
//        subject.onNext("F");
//        sleep(1000);
//        subject.onNext("G");
//        sleep(1000);


        /** this is async Subject which is interested in the last thing will explained
         in this example out put will be
         FirstG
         SecondG
         */
//
//        AsyncSubject<String> subject = AsyncSubject.create();
//
//        subject.subscribe(i -> Log.d(TAG, "onCreate: First" + i));
//        subject.onNext("A");
//        sleep(1000);
//        subject.onNext("B");
//        sleep(1000);
//        subject.onNext("C");
//        sleep(1000);
//        subject.onNext("D");
//        sleep(1000);
//
//        subject.subscribe(i -> Log.d(TAG, "onCreate: Second" + i));
//
//        subject.onNext("E");
//        sleep(1000);
//        subject.onNext("F");
//        sleep(1000);
//        subject.onNext("G");
//        sleep(1000);
//        subject.onComplete();

        /** this is observer part */


//        Observer observer = new Observer() {
//            @Override
//            public void onSubscribe(Disposable d) {
//                Log.d(TAG, "onSubscribe: ");
//            }
//
//            @Override
//            public void onNext(Object o) {
//                Log.d(TAG, "onNext: " + o);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                Log.d(TAG, "onError: " + e.getMessage());
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        };


        /** create method */
//        Observable observable = Observable.create(new ObservableOnSubscribe<Object>() {
//            @Override
//            public void subscribe(ObservableEmitter<Object> emitter) throws Exception {
//                for (int i = 0; i < 5; i++) {
//                    emitter.onNext(i);
//                }
//                emitter.onComplete();
//            }
//        });


        /** just method */
//        Observable observable = Observable.just(0, 1, 2, 3, 4);

        /** FromArray method */
//        Integer[] list = new Integer[5];
//        list[0] = 0;
//        list[1] = 1;
//        list[2] = 2;
//        list[3] = 3;
//        list[4] = 4;
//        Observable observable = Observable.fromArray(list);

        /** range method */
//        Observable observable = Observable.range(0,5);

        /** timer method */
//        Observable observable = Observable.timer(0, TimeUnit.SECONDS); which mean after this time emitter will fire

//        observable.subscribe(observer);


        /** Threading and schedulers part*/

//        Observable.just(1, 2, 3, 4, 5)
//                .doOnNext(c -> Log.d(TAG, "mo upStream: " + c + " current Thread" + Thread.currentThread().getName()))
//                .subscribeOn(Schedulers.computation())
//                .subscribe(o -> Log.d(TAG, "mo  downStream: " + o + " current Thread" + Thread.currentThread().getName()));


    }

    public void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
